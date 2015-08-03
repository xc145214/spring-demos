package com.xc.controller;

import com.xc.vo.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2015/8/3.
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person view(@PathVariable("id") Integer id) {
        Person person = new Person();
        person.setId(id);
        person.setName("haquen");
        return person;
    }
}
