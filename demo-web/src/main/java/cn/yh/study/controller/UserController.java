package cn.yh.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping("testUU")
	public String testUU() {
		return "dfdsfdfs";
	}
}
