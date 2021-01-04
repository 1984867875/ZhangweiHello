package com.crx.quanxian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.crx.quanxian.model.Message;
import com.crx.quanxian.model.User;
import com.crx.quanxian.service.UserService;

@Controller
//@RestController //json
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("quanxian/view.do")
 public  ModelAndView view(ModelAndView mv) {
    List<User> list = service.queryUserList();
    	mv.addObject("list",list);
    	mv.setViewName("/user/view");
    return mv;
  }
   @RequestMapping("quanxian/delete") 
   @ResponseBody
   public Message delete(User user) {
	  
	   service.updateUser(user);
	   Message mess= new Message();
	   mess.setMess("success");
	   return mess;
   }
}