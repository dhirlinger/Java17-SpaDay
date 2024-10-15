package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    //points to /user/add
    @GetMapping("add")
    public String displayAddUserForm(){
    return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        //model.addAttribute(user);


        if (user.getPassword().equals(verify)) {
            String message = "Welcome " + user.getUsername() +".";
            model.addAttribute("message", message);
            return "user/index";
        } else {
            model.addAttribute("error", "Password verification did not match password.");
            model.addAttribute("username", user.getUsername());
            model.addAttribute("email", user.getEmail());
            return "user/add";
        }
    }


}
