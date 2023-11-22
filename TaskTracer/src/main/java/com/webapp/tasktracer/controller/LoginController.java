package com.webapp.tasktracer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
   
  @GetMapping("/")
  public String LoginPage(){
    return "login";
  }
 @PostMapping("/")
  public String LoginVarification(ModelMap model,@RequestParam String username,@RequestParam String password){
    if(username.equals("Lipa")&&password.equals("Lipa987@#")){
      return "tasks";
    }
    return "login";
  }
    
}
