package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
/**import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;*/



@RestController

public class DemoController {
   @RequestMapping("/")
   public String displayDefaulMessage(){
       return "Welcome to First Java Spring Boot Application";
   }
   
}
