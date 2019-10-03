package mum.waa.october2019.lab03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {

    @RequestMapping(value = {"/"})
    public String home() {
        System.out.println("HomeController.home()");
        return "home";
    }
}
