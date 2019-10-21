package mo.essam.controllers;

import mo.essam.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/addform")
    public ModelAndView StudentForm(){
        ModelAndView view = new ModelAndView();
        view.setViewName("studentlogin");
        return view;
    }

    @RequestMapping("/add")
    public ModelAndView StudentForm(Student student){
        ModelAndView view = new ModelAndView();
        view.setViewName("studentlogin");
        return view;
    }


}
