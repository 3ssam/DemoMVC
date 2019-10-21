package mo.essam.controllers;

import mo.essam.DAO.StudentDAO;
import mo.essam.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping("/addform")
    public ModelAndView studentForm(){
        ModelAndView view = new ModelAndView();
        view.setViewName("studentlogin");
        return view;
    }

    @RequestMapping("/add")
    public void addStudent(Student student){
        studentDAO.save(student);
    }

    @RequestMapping("/show")
    public ModelAndView getStudent(@RequestParam int id){
        ModelAndView view = new ModelAndView("home");
        Student student = studentDAO.findById(id).orElse(null);
        view.addObject("student",student);
        return view;
    }


    @RequestMapping("/delete")
    public ModelAndView deleteStudent(@RequestParam int id){
        String response;
        ModelAndView view = new ModelAndView("home");
        Student student = studentDAO.findById(id).orElse(null);
        if (student == null)
            response = "Error this id is not found";
        else {
            response = "we are delete this id = " + id;
            studentDAO.deleteById(id);
        }
        view.addObject("response", response);
        return view;
    }


    @RequestMapping("/update")
    public ModelAndView updateStudent(@RequestParam int id,Student student){
        String response;
        ModelAndView view = new ModelAndView("home");
        Student Orignalstudent = studentDAO.findById(id).orElse(null);
        if (student == null)
           studentDAO.save(student);
        else {
            student.setId(id);
            studentDAO.save(student);
        }
        view.addObject("student", student);
        return view;
    }



}
