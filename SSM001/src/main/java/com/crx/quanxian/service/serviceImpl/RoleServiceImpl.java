package com.crx.quanxian.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crx.quanxian.dao.RoleMapper;
import com.crx.quanxian.dao.RoleResMapper;
import com.crx.quanxian.dao.UserRoleMapper;
import com.crx.quanxian.model.Message;
import com.crx.quanxian.model.Role;
import com.crx.quanxian.model.RoleExample;
import com.crx.quanxian.model.RoleResExample;
import com.crx.quanxian.model.User;
import com.crx.quanxian.model.UserRoleExample;
import com.crx.quanxian.model.UserRoleKey;
import com.crx.quanxian.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper mapper;
    
    @Autowired 
    private UserRoleMapper urmapper;
    
    @Autowired
    private RoleResMapper rrmapper;
    
    
	@Override
	public List<Role> queryRoleList() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(new RoleExample());
	}
	@Override
	public List<UserRoleKey> queryRoleListByUser(User user) {
		UserRoleExample example =new UserRoleExample();
		example.createCriteria().andUidEqualTo(user.getUid());
		List<UserRoleKey> keys = urmapper.selectByExample(example);
		return keys;
	}
	/*
	 * 绑定角色
	 * 删除原来的角色
	 */
	@Override
	public void bandRole(User user, Integer[] rids) {
		
		UserRoleExample example =new UserRoleExample();
		example.createCriteria().andUidEqualTo(user.getUid());
		urmapper.deleteByExample(example);
		//增
		if(rids!=null) {
		for(int  rid:rids) {
			UserRoleKey rolekey =new UserRoleKey();
			rolekey.setUid(user.getUid());
			rolekey.setRid(rid);
			urmapper.insert(rolekey);
		}
		}
	}
	/*
	 * 新增
	 */
	@Override
	public Message save(Role role) {
		Message mess =new Message();
		try {
			mapper.insert(role);
			mess.setMess("success");
		}catch(Exception e) {
			mess.setMess("系统错误");
		}
	
			return mess;
	}
	/*
	 * 角色列表
	 */
	@Override
	public List<Role> selectRoleList() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(new RoleExample());
	}
	/*
	 * 
	 * 删除角色及角色所关联中间表
	 */
	@Override
	public Message deleteRole(Role role) {
		Message mess =new Message();
	try {
		//删除用户和角色的中间表
		UserRoleExample  example = new UserRoleExample();
		example.createCriteria().andRidEqualTo(role.getRid());
		urmapper.deleteByExample(example);
		//删除角色和资源的中间表
		RoleResExample example2 =new RoleResExample();
		example.createCriteria().andRidEqualTo(role.getRid());
		rrmapper.deleteByExample(example2);
		
	//删除角色表
		mapper.deleteByPrimaryKey(role.getRid());
		mess.setMess("success");
	} catch (Exception e) {
		mess.setMess("系统错误");
	}
		
		
		
		return mess;
	}


	

}
