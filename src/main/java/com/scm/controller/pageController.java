package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class pageController {

    @RequestMapping("/home")
    public  String home(Model model)

    {
      model.addAttribute("Name", "Not Avilable");   

      model.addAttribute("linkdinProfile", "https://www.linkedin.com/in/jasujabhavishya/"); 
      return "home";
    }


    // about page
    @RequestMapping("/about")
    public  String aboutPage(Model model)

    {
      model.addAttribute("islogin", true);
      return "about";
    }

   // Services
   @RequestMapping("/services")
   public  String servicesPage()

   {
     return "services";
   }

   // Services
   @RequestMapping("/contact")
   public  String contactPage()

   {
     return "contact";
   }


   // Services
   @RequestMapping("/login")
   public  String loginPage()

   {
     return "login";
   }

   // Services
   @RequestMapping("/signup")
   public  String signupPage()

   {
     return "signup";
   }

}
