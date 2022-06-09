package com.tekssystems.app.controllers;

import com.tekssystems.app.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@Slf4j
public class HomeController {

    @Value("${app.myname}")
    String myname;

    @ModelAttribute("stu")
    public Student initStudent(){
        return new Student();
    }

    @GetMapping("/studentinfo")
    @RequestMapping(value = "/studentinfo", method = {RequestMethod.POST, RequestMethod.GET})
    public String logStudentInformation(Model model){

//        Student student = new Student("jafer@gmail.com","jafer","password");
//        model.addAttribute("stu",student);
//        model.addAttribute("date", new Date());
//        model.addAttribute("myname",myname);

            log.info("we did it!!");
        return "index";
    }





}
