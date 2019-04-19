package com.example.demofrist.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    /******premier methode****/
//     @GetMapping("/home")
//    public String home(HttpServletRequest request, ModelMap modelMap)
//    {
//        String name =  request.getParameter("name") != null && !request.getParameter("name").isEmpty() ?
//        request.getParameter("name") : "rentre des info" ;
//        System.out.println("\n\n"+name);
//        modelMap.put("name", name);
//       return "homepage";
//    }

    @GetMapping("/home")
    public String home(@RequestParam(required = false,defaultValue ="votre nom svp")  String name,ModelMap modelMap)   {

        modelMap.put("name", name);
        return "homepage";
    }
}
