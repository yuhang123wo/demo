package cn.yh.study.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.yh.study.base.service.UserinfoService;

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
	private UserinfoService userinfoService;

	@RequestMapping("testUU")
	public String testUU() {
//		userinfoService.queryUserinfo(1, 1);
		System.out.println(userinfoService.findRoleAll());
		return "dfdsfdfs";
	}
}
