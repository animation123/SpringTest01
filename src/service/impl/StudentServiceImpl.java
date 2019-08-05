package service.impl;

import dao.IStudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.IStudentService;

public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentDao studentDao;

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public String queryStudentById() {
        return studentDao.queryStudentById();
    }
}
