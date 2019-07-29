package test;

import entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setStuNo(1);
//        student.setStuName("zs");
//        student.setStuAge(23);
//        System.out.println(student);

        // Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 直接从springIOC容器中获取一个id为student的对象
        Student student = (Student)context.getBean("student");
        System.out.println(student);
        // 1.new
        // 2.对象属性的复制
    }
}
