package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String allUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "allusers";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {

        return "/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }


//    @RequestMapping("/addNewUser")
//    public String addNewUser(Model model){
//        User user = new User();
//        model.addAttribute("user", user);
//
//        return "user-info";
//    }
//
//    @RequestMapping("/saveUser")
//    public String saveUser(@ModelAttribute("user") User user){
//
//        userService.saveUser(user);
//
//        return "redirect:/users";
//    }






}
