package controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentService;

import java.util.Map;

@RequestMapping("controller")
@Controller
public class StudentController {
    // 控制器依赖于Service
    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("queryStudentByNo/{stuno}")
    public String queryStudentByNo(@PathVariable("stuno") Integer stuNo, Map<String, Object> map) {
        Student student = studentService.queryStudentByNo(stuNo);
        map.put("student", student);
        return "result";
    }
}
