package org.launchcode.controllers;

import org.launchcode.data.UserData;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public String displayAddUserForm(){

        return "/user/add";
    }

    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if(verify.equals(user.getPassword())){

            model.addAttribute("message", "Welcome " + user.getUsername() + "!");
            UserData.add(user);
            /*model.addAttribute("user", user);*/
            model.addAttribute("users", UserData.getAll());
            return "/user/index";
        } else {
            model.addAttribute("error","Password and verify did not match.");
            model.addAttribute("username", user.getUsername());
            model.addAttribute("email", user.getEmail());

            return "/user/add";
        }
    }

    @GetMapping("/details/{id}")
    public String displayUserDetails(@PathVariable int id, Model model){
        model.addAttribute("user", UserData.getById(id));
        return "/user/details";
    }
}
