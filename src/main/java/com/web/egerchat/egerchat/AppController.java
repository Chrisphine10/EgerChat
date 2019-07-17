package com.web.egerchat.egerchat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@Autowired
	private ChatService chatservice;

	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/")
	public String viewLoginPage(Model model) {

		List<User> listUsers = userservice.listAll();
		model.addAttribute("listUsers", listUsers);
		List<Chat> listChats = chatservice.listAll();
		model.addAttribute("listChats", listChats);
		return "loginpage";
	}
	@RequestMapping(value = "signup")
	public String viewSignUpPage() {
		return "signup";
	}
	
	@RequestMapping(value = "home")
	public String viewHomePage() {
		return "homepage";
	}
	@RequestMapping(value = "chatsview")
	public String viewChats() {
		return "chatsview";
	}
	@RequestMapping(value = "chatslist")
	public String viewChatslist() {
		return "chatslist";
	}
	@RequestMapping(value = "contactus")
	public String viewContactUs() {
		return "contactus";
	}
	@RequestMapping(value = "profile")
	public String viewProfile() {
		return "profile";
	}
	@RequestMapping(value = "aboutus")
	public String viewAboutUs() {
		return "aboutus";
	}
	@RequestMapping(value = "reset")
	public String viewPassReset() {
		return "passreset";
	}
	@RequestMapping(value = "terms")
	public String viewTerms() {
		return "terms";
	}
	@RequestMapping(value = "editprofile")
	public String viewEditProfile() {
		return "editprofile";
	}
	@RequestMapping(value = "sq")
	public String viewSecurity() {
		return "security";
	}
	@RequestMapping(value = "un")
	public String viewUserName() {
		return "un";
	}
	
}
