package entity;

import factory.CourseFactory;
import newinstance.HtmlCourse;
import newinstance.ICourse;
import newinstance.JavaCourse;

import javax.swing.plaf.ColorUIResource;

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

    public void learn(String name) { // 学习任何课程
        ICourse course = CourseFactory.getCourse(name);
        // course就是根据name拿到的相应的课程
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
