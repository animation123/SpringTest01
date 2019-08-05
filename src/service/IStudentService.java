package service;

import entity.Student;

public interface IStudentService {
    void addStudent(Student student);

    void deleteStudentByNo(int stuNo);
}
