package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalcController implements ErrorController{
    //Instansierar mathService här
    private mathService ms = new mathService();

     //example: http://localhost:8080/math/?operation=multiplication&value1=10&value2=20
    // @RequestMapping("/math/")
    // public String math(String operation, float value1, float value2) {
    //     float result = 0;
    //     switch(operation) {
    //         case "addition":
    //             result = value1 + value2;
    //             break;
    //         case "subtraction":
    //             result = value1 - value2;
    //             break;
    //         case "multiplication":
    //             result = value1*value2;
    //             break;
    //         case "division":
    //             result = value1/value2;
    //             break;
    //     }
    //     String returnValue = String.valueOf(result);
    //     return returnValue;


    // }
    @CrossOrigin
    @RequestMapping("/")
    public String root(){
        return ms.Description();
    }
    
    @RequestMapping("/add")
    public int addition(){
        return ms.addition();
    }
    @RequestMapping("/sub")
    public int subtraction(){
        return ms.subtraction();
    }
    @RequestMapping("/multi")
    public int multiplication(){
        return ms.multiplication();
    }
    @RequestMapping("/div")
    public int division(){
        return ms.division();
    }

    private static final String PATH = "/error";
    @RequestMapping(value = PATH, produces = MediaType.TEXT_HTML_VALUE)
    public String error(){
        return "This URL does not work. Please try another URL";
    }
    public String getErrorPath(){
        return PATH;
    }

}