package mo.essam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(HttpServletRequest request){
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        session.setAttribute("name",name);
        System.out.println(name);
        return "home";
    }
}
