package com.tekssystems.app.controllers;


import com.tekssystems.app.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RestControllerExample {

    @GetMapping("/jafer")
    public Student studentExample(){
        return new Student("jafar@gmail.com", "jafer","password");
    }

    @PutMapping("/user")
    public ResponseEntity printUser(@RequestBody Student student){
        log.info(student.toString());
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



}
