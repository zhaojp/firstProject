package com.firstproject.test.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.firstproject.test.core.IndexService;


@Controller
public class IndexController{


    @Autowired
    private IndexService indexService;

    @RequestMapping(value="/abc",method=RequestMethod.GET)
    @ResponseBody
    public String doGet(){
        return indexService.getString();
    }


    @RequestMapping(value="/do",method=RequestMethod.GET)
    @ResponseBody
    public String doGet2(){
        return "hah";
    }
}