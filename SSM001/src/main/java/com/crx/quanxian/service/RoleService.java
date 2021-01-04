package com.crx.quanxian.service;

import java.util.List;

import com.crx.quanxian.model.Message;
import com.crx.quanxian.model.Role;
import com.crx.quanxian.model.User;
import com.crx.quanxian.model.UserRoleKey;

public interface RoleService {

	List<Role> queryRoleList();

	List<UserRoleKey> queryRoleListByUser(User user);

	void bandRole(User user, Integer[] rids);

	Message save(Role role);

	List<Role> selectRoleList();



	Message deleteRole(Role role);

}
