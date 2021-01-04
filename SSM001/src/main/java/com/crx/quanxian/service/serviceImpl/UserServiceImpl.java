package com.crx.quanxian.service.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crx.quanxian.dao.UserMapper;
import com.crx.quanxian.model.Message;
import com.crx.quanxian.model.User;

import com.crx.quanxian.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper  mapper;

	@Override
	public Message login(HttpServletRequest request, User user) {
		HttpSession session    = request.getSession();

		User u =  mapper.selectByUser(user);
		Message message = new Message();
		
		if(u!=null) {
			
			message.setMess("success");
			session.setAttribute("user", u);
		}else {
			message.setMess("fail");
		}
		return message;
		 
	 
		
	}
/**
 * 用户列表 查找所有
 */
	@Override
	public List<User> queryUserList() {
		// TODO Auto-generated method stub
		return mapper.queryUserList();
	}
	/**
	 * 更改用户信息 （删除）
	 */
@Override
public void updateUser(User user) {
	mapper.deleteByPrimaryKey(user.getUid());
	
}

}
