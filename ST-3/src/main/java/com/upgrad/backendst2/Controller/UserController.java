package com.upgrad.backendst2.Controller;


import com.upgrad.backendst2.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/") //localhost:8080/ : post
    public String validate(Model model){
        User user = new User();
        model.addAttribute("User", user);
        return "index";
    }
}
