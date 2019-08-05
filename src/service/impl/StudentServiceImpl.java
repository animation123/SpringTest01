package service.impl;

import dao.IStudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.IStudentService;

public class StudentServiceImpl implements IStudentService {
    IStudentDao studentDao;

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Transactional(readOnly=false, propagation= Propagation.REQUIRED)
    @Override
    public void addStudent(Student student) {
//        studentDao = null; // 测试异常通知
        // if（该学生是否存在）
        // 增加其他...
        studentDao.addStudent(student);
    }

    @Override
    public void deleteStudentByNo(int stuNo) {
        System.out.println("模拟删除....");
    }
}
