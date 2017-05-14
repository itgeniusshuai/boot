package com.boot.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.common.CommonResult;

@Controller
public class UserController {
	
	@RequestMapping("/login")
	@ResponseBody
	public CommonResult login(User user){
		return CommonResult.success(null, null);
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public CommonResult test(User user){
		return CommonResult.success(null, null);
	}
}
