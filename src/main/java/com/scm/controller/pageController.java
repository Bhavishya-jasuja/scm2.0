package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.forms.UserForm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;




@Controller
public class pageController {

    @RequestMapping("/home")
    public  String home(Model model)

    {
      model.addAttribute("Name", "Not Avilable");   

      model.addAttribute("linkdinProfile", "https://www.linkedin.com/in/jasujabhavishya/"); 
      return "home";
    }


    // about my page 
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
   @GetMapping("/signup")
   public  String signupPage(Model model)

   {
     UserForm userForm = new UserForm();
     userForm.setName("Bhavishya");
     userForm.setEmail("bhavishya@gmail.com");

     userForm.setPassword("1234567890");
     userForm.setPhoneNumber("1234567890");
     userForm.setAbout("I am a software developer");

      model.addAttribute("userForm", userForm);
    


     return "signup";
   }

   // do register
   @RequestMapping(value= "/do-register" , method = RequestMethod.POST)
   public  String processRegister(@ModelAttribute UserForm userForm)
   {
     //fetch data from form
     userForm.getName();
     userForm.getEmail();
     userForm.getPassword();
     userForm.getPhoneNumber();
     userForm.getAbout();


    //  System.out.println(userForm);
    //validate data
    // save data in database
    //message = "User registered successfully"
    //redirect to login page
     return "redirect:/signup";
   }
}
