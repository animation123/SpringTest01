package factory;

import newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 课程工厂
public class CourseFactory {
    // 根据名字获取课程
    public static ICourse getCourse(String name) {
        // 获取IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        if (name.equals("java")) {
            return (ICourse) context.getBean("javaCourse");
        } else {
            return (ICourse) context.getBean("htmlCourse");
        }
    }
}
