package com.xc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/7/31.
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    //÷ÿ∂®œÚ
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "final";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String gotoPage() {
        return "redirect:/pages/home.html";
    }
}
