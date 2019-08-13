//package servlet;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//import service.IStudentService;
//import service.impl.StudentServiceImpl;
//
//import javax.servlet.ServletException;
//import java.io.IOException;
//
//public class QueryStudentByIdServlet extends javax.servlet.http.HttpServlet {
//    IStudentService studentService; // 通过SpringIOC容器将studentService注入给Servlet
//
//    // Servlet初始化方法：在初始化时，获取SpringIOC容器中的Bean对象
//
//    @Override
//    public void init() throws ServletException {
////        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-Service.xml");
//        // Web项目获取Spring上下文对象context
//        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
//        // 当前是在Servlet容器中，通过getBean获取IOC容器中的Bean
//        studentService = (IStudentService)context.getBean("studentService");
//    }
//
//    public void setStudentService(IStudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        doGet(request, response);
//    }
//
//    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//
//        String name = studentService.queryStudentById();
//        request.setAttribute("name", name);
//        request.getRequestDispatcher("result.jsp").forward(request, response);
//    }
//}
