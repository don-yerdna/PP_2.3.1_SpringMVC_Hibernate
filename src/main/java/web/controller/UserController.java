package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;


@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String listUsers(@RequestParam(value = "count", defaultValue = "10") int count, Model model) {
        model.addAttribute("users", userService.getUsersOfCount(count));
        model.addAttribute("count", userService.getCountUsers());
        return "users/users";
    }

    @RequestMapping("/add")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user",user);
        return "users/user-info";
    }

    @RequestMapping("/edit")
    public String editUser(@RequestParam(value = "id", required = true) Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "users/user-info";
    }

    @RequestMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }
}
