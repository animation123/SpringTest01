package dao.impl;

import dao.IStudentDao;
import entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <bean id="studentDao" class="dao.impl.StudentDaoImpl></bean>
 */

//@Component("studentDao")
//@Service("studentService")
public class StudentDaoImpl implements IStudentDao {
    @Override
    public String queryStudentById() {
        // 模拟通过JDBC查询数据
        System.out.println("1   zs  23");
        return "zs";
    }
}
