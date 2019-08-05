package test;

import entity.AllCollectionType;
import entity.Course;
import entity.Student;
import factory.CourseFactory;
import newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IStudentService;

import java.security.AllPermission;

public class Test {

    public static void SpringIOC() {
        // Spring上下文对象：context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 执行从SpringIOC容器中获取一个id为student的对象
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    public static void learnCourse() {
        Student student = new Student();
        student.learnHtml();
        student.learnJava();
    }

    public static void collectionDemo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AllCollectionType type = (AllCollectionType) context.getBean("collectionDemo");
        System.out.println(type);
    }

    public static void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = (IStudentService) context.getBean("studentService");
        Student student = new Student();
        student.setStuAge(23);
        student.setStuName("zs");
        studentService.addStudent(student);

        studentService.deleteStudentByNo(1);
    }

    public static void testDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course = (Course) context.getBean("course");
        course.showInfo();
    }

    public static void learnCourseWithFactory() {
        Student student = new Student();
        student.learn("java");
    }

    public static void learnCourseWithIOC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 执行从SpringIOC容器中获取一个id为student的对象
        Student student = (Student) context.getBean("student");
        student.learn("htmlCourse");
    }

    public static void main(String[] args) {
        // Java程序的入口是统一的main()，因此只需要在main中实例化一次applicationContext.xml，就可以实现“IOC容器”初始化操作
//         learnCourse();
//         learnCourseWithFactory();
//        learnCourseWithIOC();
//        testDI();
//        collectionDemo();
        testAop();
    }
}
