package mo.essam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(String name,@RequestParam("lastname") String nametwo, HttpSession session){
        session.setAttribute("name",name);
        session.setAttribute("secondname",nametwo);
        System.out.println(name);
        System.out.println(nametwo);
        return "home";
    }
}
