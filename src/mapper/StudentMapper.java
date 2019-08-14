package mapper;

import entity.Student;

public interface StudentMapper {
    public void addStudent(Student student);
    Student queryStudentByStuno(int stuno);
}
