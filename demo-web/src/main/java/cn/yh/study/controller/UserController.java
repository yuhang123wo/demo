package cn.yh.study.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yh.study.base.domain.User;
import cn.yh.study.base.service.UserService;
/**
 * 
 * @author yh
 * @Date   2017年10月13日
 * @desc
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("testUU")
	@ResponseBody
	private void testUU() {
		User user = new User();
		user.setUserName("dsfsdf");
		user.setTest("test");
//		userService.saveOne(user);
		System.out.println(userService.findOne());
	}
}
