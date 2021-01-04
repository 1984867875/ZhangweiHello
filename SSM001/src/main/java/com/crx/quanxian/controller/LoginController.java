package com.crx.quanxian.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crx.quanxian.model.Message;
import com.crx.quanxian.model.User;
import com.crx.quanxian.service.UserService;


@Controller
public class LoginController {
	
	@Autowired
	private  UserService  service;
	
	
	@RequestMapping("index")
	public  String  indexShow() {
		return "/sys/login";
	}
	
	//以ajax 异步的形式发起的请求
	@RequestMapping("login")
	@ResponseBody
	public  Message login(User  user,HttpServletRequest request) {
		 return service.login(request, user);
		
	}
	@RequestMapping("main")
	public  String main() {
		 return "/sys/main";
		
	}
}
