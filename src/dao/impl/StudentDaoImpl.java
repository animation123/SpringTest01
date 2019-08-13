package dao.impl;

import mapper.StudentMapper;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * <bean id="studentDao" class="dao.impl.StudentDaoImpl></bean>
 */

//@Component("studentDao")
//@Service("studentService")
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentMapper {
    @Override
    public void addStudent(Student student) {
        SqlSession session = super.getSqlSession();
        StudentMapper stuDao = session.getMapper(StudentMapper.class);
        stuDao.addStudent(student);
    }
    //    @Override
//    public String queryStudentById() {
//        // 模拟通过JDBC查询数据
//        System.out.println("1   zs  23");
//        return "zs";
//    }
}
