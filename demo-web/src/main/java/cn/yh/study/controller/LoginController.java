package cn.yh.study.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
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
