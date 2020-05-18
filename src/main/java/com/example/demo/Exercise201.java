package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Exercise201 {

    @RequestMapping("/submit")
    public String submitInput(){
        return "submitForm";
    }

    @RequestMapping("/displaySubmition")
    public String submitDisplay(@RequestParam("email") String email, Model model){
    model.addAttribute("emailInput", email);
    return "displaySubmition";
    }

}
