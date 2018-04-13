package org.meihuai.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.meihuai.configuration.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
  
/**
 * 
 */  
@RestController  
public class Controller {
    @Autowired
    private Person person;
    @RequestMapping("/now")  
    String getTime(){  
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmssSSS");  
        return sdf.format(new Date());  
    }  
      
    @RequestMapping("/")  
    String welcome(){  
        return "你好！";  
    }
    @RequestMapping("/getPerson")
    Person getPerson(){
        return person;
    }

}  