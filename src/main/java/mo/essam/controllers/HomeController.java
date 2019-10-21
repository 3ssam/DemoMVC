package mo.essam.controllers;

import mo.essam.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(Student student){
        ModelAndView view = new ModelAndView();
        view.addObject("student",student);
        System.out.println(student);
        view.setViewName("home");
        return view;
    }
}
