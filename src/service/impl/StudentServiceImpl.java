package service.impl;

import entity.Student;
import mapper.StudentMapper;
import service.IStudentService;

public class StudentServiceImpl implements IStudentService {
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void addStudent(Student student) {
        // 调用dao层
        studentMapper.addStudent(student);
    }
    //    @Autowired
//    IStudentDao studentDao;
//
//    public void setStudentDao(IStudentDao studentDao) {
//        this.studentDao = studentDao;
//    }
//
//    @Override
//    public String queryStudentById() {
//        return studentDao.queryStudentById();
//    }
}
