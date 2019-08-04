package dao.impl;

import dao.IStudentDao;
import entity.Student;
import org.springframework.stereotype.Component;

/**
 * <bean id="studentDao" class="dao.impl.StudentDaoImpl></bean>
 */

@Component("studentDao")
public class StudentDaoImpl implements IStudentDao {
    public void addStudent(Student student) {
        System.out.println("增加学生...");
    }
}
