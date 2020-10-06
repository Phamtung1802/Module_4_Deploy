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


    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mov=new ModelAndView("index");
        Iterable<AppRole> roles= appRoleServiceImpl.findAll();
        Iterable<AppUser> users=appUserServiceImpl.findAll();
        for(AppUser user: users){
            System.out.println(user.getUserName());
        }
        mov.addObject("roles",roles);
        mov.addObject("users",users);
        return mov;
    }
}
