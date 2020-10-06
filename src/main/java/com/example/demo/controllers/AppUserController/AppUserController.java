package com.example.demo.controllers.AppUserController;

import com.example.demo.models.AppRole;
import com.example.demo.models.AppUser;
import com.example.demo.services.AppRoleService;
import com.example.demo.services.AppUserService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.io.File;
import java.io.IOException;

@Controller
public class AppUserController {
    @Autowired
    private AppRoleService appRoleServiceImpl;

    @Autowired
    private AppUserService appUserServiceImpl;



    @PostMapping(path = "/create",consumes = {"multipart/form-data",MediaType.APPLICATION_JSON_VALUE} )
    public ModelAndView createUser(@RequestPart(name = "appUser") AppUser appUser, @RequestPart (name="avatar")MultipartFile multipartFile) throws IOException {
        ModelAndView mov=new ModelAndView("/index");
        //1 gan student nhung thuoc tinh cua studentForm        System.out.println(smartphone);

        String image = multipartFile.getOriginalFilename();
        String fileUpload = "C:/Users/ADMIN/Desktop/destination/";
        File result=null;
        try {
            FileCopyUtils.copy(multipartFile.getBytes(),result= new File(fileUpload + image));
        } catch (IOException e) {
            e.printStackTrace();
        }
        appUser.setImage(result.getName());
        appUserServiceImpl.save(appUser);
        return mov;
    }
}
