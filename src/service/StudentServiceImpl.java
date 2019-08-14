package service;

import entity.Student;
import mapper.StudentMapper;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
    // service依赖于Dao(mapper)
    private StudentMapper studentMapper; // = new StudentMapper();...

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Student queryStudentByNo(int stuNo) {
        return studentMapper.queryStudentByStuno(stuNo);
    }

    //    private StudentMapper studentMapper;
//
//    public void setStudentMapper(StudentMapper studentMapper) {
//        this.studentMapper = studentMapper;
//    }
//
//    @Override
//    public void addStudent(Student student) {
//        // 调用dao层
//        studentMapper.addStudent(student);
//    }
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
