package com.tekssystems.app.controllers;

import com.tekssystems.app.models.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller @Slf4j
@SessionAttributes("username")
public class ModelAndViewController {



    @GetMapping("getouserviewpage")
    public ModelAndView userModelAndView(){
        List<User> listUser = Arrays.asList(
                new User(1,"jafer","jafer@gmail.com"),
                new User(2,"a","a@gmail.com"),
                new User(3,"b","b@gmail.com")
                );

        ModelAndView modelAndView = new ModelAndView("userdata");
        modelAndView.addObject("userlist",listUser);
        return modelAndView;

    }
    @GetMapping("/username")
    public String userName(@ModelAttribute("username") String user){
        log.info(user);
        return "username";
    }

    @ModelAttribute("username")
    public String userNameAtt(){
        return "jafer";
    }


}
