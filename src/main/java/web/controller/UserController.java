package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;
import web.service.UserServiceImp;


@Controller
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String listCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("users", userService.getUsersOfCount(count));
        model.addAttribute("count", userService.getCountUsers());
        return "users/index";
    }
}
