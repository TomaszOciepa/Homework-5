package web;

import freemarker.TemplateProvider;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import model.Student;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import repository.StudentRepository;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.*;

@WebServlet(urlPatterns = "/infoShareAcademy")
public class ShowValuesServlet extends HttpServlet {

    private static final String TEMPLATE_NAME = "infoShareAcademy";

    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.addHeader("Content-Type", "text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        StudentRepository students = new StudentRepository();
        List<Student> studentList = students.getStudents();

        Template template = templateProvider.getTemplate(getServletContext(), TEMPLATE_NAME);

        Map<String, Object> model = new HashMap<>();
        model.put("student", studentList);
        model.put("data", LocalDateTime.now());

        try {
            template.process(model,writer);
        } catch (TemplateException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.addHeader("Content-Type", "text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        Map<String, String[]> parameterMap  = req.getParameterMap();

        parameterMap.forEach((k,v)->{
           for (int i =0; i < v.length; i++){
               writer.println(k +": "+ v[i]);
               writer.println("<br>");
           }

       });

    }

}
