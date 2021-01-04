package com.crx.quanxian.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.crx.quanxian.model.Message;
import com.crx.quanxian.model.Role;
import com.crx.quanxian.model.User;
import com.crx.quanxian.model.UserRoleKey;
import com.crx.quanxian.service.RoleService;

@Controller
public class RoleController {
   @Autowired
   private RoleService service;
   @RequestMapping("roleView")
   public String  view(HttpServletRequest request,User user) {
	  List<Role> list = service.queryRoleList();//所有的角色
      List<UserRoleKey> mylist =service.queryRoleListByUser(user);//当前用户所有角色
      // 处理选中角色
      String rids ="";
      for(UserRoleKey r:mylist) {
    	  rids+=r.getRid()+",";
      }
      request.setAttribute("list",list);
      request.setAttribute("myrole",rids);
      request.setAttribute("uid",user.getUid());
      return "/role/band";
   }
   /**
    * 绑定角色
    * @param user
    * @param rids
    * @return
    */
   @RequestMapping("saveRole")
    public String saveRole(User user,Integer[] rids) {
		
	   service.bandRole(user,rids);
	   return "redirect:quanxian/view.do"; 
   }
   @RequestMapping("save.do")
   public String save() {
	   return "/role/save";
   }
   @RequestMapping("add.do")
   @ResponseBody
   public Message  insert(Role role){
	 return service.save(role);
    
   }
   @RequestMapping("selectRole")
   public String view(HttpServletRequest request) {
	   List<Role> list = service.selectRoleList();
	   request.setAttribute("list",list);
	   return"/role/view";
   }
   //删除角色
     @RequestMapping("delete.do")
     @ResponseBody
     public Message  delete(Role role){
    	 return  service.deleteRole(role);
        
       }
}
