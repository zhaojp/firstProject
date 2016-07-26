package com.firstproject.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController{

    @RequestMapping(value="/abc",method=RequestMethod.GET)
    @ResponseBody
    public String doGet(){
        return "ohyeah";
    }


    @RequestMapping(value="/do",method=RequestMethod.GET)
    @ResponseBody
    public String doGet2(){
        return "hah";
    }
}