package factory;

import newinstance.HtmlCourse;
import newinstance.ICourse;
import newinstance.JavaCourse;

// 课程工厂
public class CourseFactory {
    // 根据名字获取课程
    public static ICourse getCourse(String name) {
        if (name.equals("java")) {
            return new JavaCourse();
        } else {
            return new HtmlCourse();
        }
    }
}
