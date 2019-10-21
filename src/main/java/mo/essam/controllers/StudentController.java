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
    public ModelAndView StudentForm(){
        ModelAndView view = new ModelAndView();
        view.setViewName("studentlogin");
        return view;
    }

    @RequestMapping("/add")
    public void StudentForm(Student student){
        studentDAO.save(student);
    }

    @RequestMapping("/show")
    public ModelAndView StudentForm(@RequestParam int id){
        ModelAndView view = new ModelAndView("home");
        Student student = studentDAO.findById(id).orElse(null);
        view.addObject("student",student);
        return view;
    }



}
