package com.xc.controller;

import com.xc.vo.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2015/8/3.
 */
@RestController
public class MyController {
    @RequestMapping("/view")
    public Person getPerson(Model model){
        Person person = new Person();
        person.setId(1);
        person.setName("hmk");
        model.addAttribute("person",person);
        return person;
    }

}
