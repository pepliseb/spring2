package pl.pepliseb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "main/home";

    }

    @GetMapping("/about")
    public String about(){
        return "main/about";

    }

    @GetMapping("/projects")
    public String projects(){
        return "main/projects";

    }

}
