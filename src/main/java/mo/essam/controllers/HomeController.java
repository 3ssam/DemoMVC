package mo.essam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(){
        System.out.println("You are ask /home url");
        return  "home.jsp";
    }
}
