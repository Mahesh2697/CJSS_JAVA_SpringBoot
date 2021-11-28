//package com.customers.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//
//public class TestControllzer {
//
//@Autowired
//    private
//}
//
//
//@RestController
//
//public class TestController {
//
//    @Autowired
//    private DateService dateService;
//
//
//    @GetMapping("/get-message")
//    public String getCustomers(){
//        return "hello world";
//    }
//
//    @GetMapping("/day-of-week/{day}")
//    public String dayOfWeek(@PathVariable Integer day){
//        return dateService.dayOfWeek(day);
//    }
//
//
//    @PostMapping("/post-message")
//    public MessageModel getCustomers(@RequestBody MessageModel message ){
//        return message;
//    }
//}