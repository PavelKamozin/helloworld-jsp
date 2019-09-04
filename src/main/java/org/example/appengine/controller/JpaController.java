package org.example.appengine.controller;

import org.example.appengine.hello.Runner;
import org.example.appengine.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JpaController {

    @Autowired
    private Runner runner;

    @Autowired
    public Person testPerson;

    @GetMapping("/jpa")
    public String getJpaData(Model model) {
        model.addAttribute("message", "This is JPA");
        model.addAttribute("personName", testPerson.getName());

        runner.checkContext();

        return "jpa";
    }
}
