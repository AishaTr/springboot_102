package com.example.springboot_102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage (Model model) {
        model.addAttribute("myvar", "say hello to the people");
        return "homeTemplate";
    }
}
