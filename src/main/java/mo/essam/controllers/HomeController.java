package mo.essam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(String name, @RequestParam("lastname") String nametwo){
        ModelAndView view = new ModelAndView();
        view.addObject("name",name);
        view.addObject("secondname",nametwo);
        System.out.println(name);
        System.out.println(nametwo);
        view.setViewName("home");
        return view;
    }
}
