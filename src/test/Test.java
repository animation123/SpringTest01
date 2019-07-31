package test;

import entity.Student;
import factory.CourseFactory;
import newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

    public static void learnCourseWithFactory() {
        Student student = new Student();
        student.learn("java");
    }

    public static void learnCourseWithIOC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 执行从SpringIOC容器中获取一个id为student的对象
        Student student = (Student) context.getBean("student");
        student.learn("java");
    }

    public static void main(String[] args) {
//         learnCourse();
//         learnCourseWithFactory();
        learnCourseWithIOC();
    }
}
