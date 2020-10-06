package com.example.demo.controllers;

import com.example.demo.models.AppRole;
import com.example.demo.models.AppUser;
import com.example.demo.services.AppRoleService;
import com.example.demo.services.AppUserService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;

@Controller
public class IndexController {
    @Autowired
    private AppRoleService appRoleServiceImpl;

    @Autowired
    private AppUserService appUserServiceImpl;


    @GetMapping("/error")
    public ModelAndView index(){
        ModelAndView mov=new ModelAndView("index");
        return mov;
    }
}
