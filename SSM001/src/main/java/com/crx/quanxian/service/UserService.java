package com.crx.quanxian.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;

import com.crx.quanxian.model.Message;
import com.crx.quanxian.model.User;

public interface UserService {

	Message  login(HttpServletRequest request,User user);

	List<User> queryUserList();

	void updateUser(User user);
}
