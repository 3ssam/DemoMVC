package mo.essam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/add")
    public ModelAndView StudentForm(){
        ModelAndView view = new ModelAndView();
        view.setViewName("studentlogin");
        return view;
    }
}
