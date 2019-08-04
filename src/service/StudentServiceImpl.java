package service;

import dao.IStudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class StudentServiceImpl implements IStudentService {
    IStudentDao studentDao;

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Transactional(readOnly=false, propagation= Propagation.REQUIRED)
    @Override
    public void addStudent(Student student) {
        // if（该学生是否存在）
        // 增加其他...
        studentDao.addStudent(student);
    }
}
