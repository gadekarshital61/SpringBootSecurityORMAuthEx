package in.nit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.nit.raghu.model.User;
import in.nit.raghu.service.IUserService;

@Controller
public class UserController {
   @Autowired
   private IUserService service;
   
   //show user register
   @GetMapping("/register")
   public String showReg() {
	   return "UserRegister";
   }
   
   //read form data for user save
   @PostMapping("/save")
   public String saveUser(@ModelAttribute User user, Model model) {
	  Integer id= service.saveUser(user);
	  String msg= "user " +id+ " saved";
	  model.addAttribute("message",msg);
	   return "UserRegister";
   }
}
