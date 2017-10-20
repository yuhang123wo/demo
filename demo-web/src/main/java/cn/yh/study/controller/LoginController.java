package cn.yh.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping("home")
	public String home() {
		System.err.println("home");
		return "home";
	}

	@RequestMapping("unauth")
	public String fail() {
		return "unauth";
	}
}
