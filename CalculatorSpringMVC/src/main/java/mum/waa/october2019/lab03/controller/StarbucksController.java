package mum.waa.october2019.lab03.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/starbucks")
@Controller
public class StarbucksController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showForm() {
        System.out.println("StarbucksController.showForm()");
        return "starbucks";
    }
}
