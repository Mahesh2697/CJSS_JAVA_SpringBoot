package com.cjss.project.controller;

import com.cjss.project.model.MessageModel;
//import com.cjss.project.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class TestController {

    @Autowired
//    private DateService dateService;


    @GetMapping("/get-message")
    public String getCustomers(){
        return "hello world";
    }
//
//    @GetMapping("/day-of-week/{day}")
//    public String dayOfWeek(@PathVariable Integer day){
//        return dateService.dayOfWeek(day);
//    }


    @PostMapping("/post-message")
    public MessageModel getCustomers(@RequestBody MessageModel message ){
      return message;
    }
}
