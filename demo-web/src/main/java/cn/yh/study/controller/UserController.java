package cn.yh.study.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yh.study.base.domain.User;
import cn.yh.study.base.service.UserService;

/**
 * 
 * @author yh
 * @Date 2017年10月13日
 * @desc
 */
@Controller
@RequestMapping(value = "user", method = { RequestMethod.POST,
		RequestMethod.GET })
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("testUU")
	public String testUU() {
		User user = new User();
		user.setUserName("dsfsdf");
		user.setTest("test");
		// userService.saveOne(user);
		System.out.println(userService.findOne());
		int n = 1 / 0;
		return "dfdsfdfs";
	}
}
