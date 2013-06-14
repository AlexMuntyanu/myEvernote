package com.notes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 */
@Controller
public class TestControler {


    @RequestMapping("/hello")
    public ModelAndView getHelloMSG(){
        return new ModelAndView("hello", "message", "TAKE YOUR HELLO !");
    }


}
