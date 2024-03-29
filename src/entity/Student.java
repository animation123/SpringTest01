package entity;

import factory.CourseFactory;
import newinstance.HtmlCourse;
import newinstance.ICourse;
import newinstance.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
    private int stuNo;
    private String stuName;
    private int stuAge;

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return this.stuNo + "," + this.stuName + "," + this.stuAge;
    }

    public void learn(String name) { // 学习任何课程 java
//        1. 从自己编写的简单工厂中获取课程
//        ICourse course = CourseFactory.getCourse(name);
        // course就是根据name拿到的相应的课程

        // 直接从IOC容器中获取
        // 2. 从SpringIOC提供的超级工厂中获取课程（之前设置过Bean）
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICourse course = (ICourse) context.getBean(name);

        course.learn();
    }

    // 学习Java课程
    public void learnJava() {
        ICourse course = new JavaCourse();
        course.learn();
    }

    // 学习Java课程
    public void learnHtml() {
        ICourse course = new HtmlCourse();
        course.learn();
    }
}
