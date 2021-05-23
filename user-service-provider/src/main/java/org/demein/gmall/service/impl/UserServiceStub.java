package org.demein.gmall.service.impl;

import java.util.List;

import org.demein.gmall.bean.UserAddress;
import org.demein.gmall.service.UserService;
import org.springframework.util.StringUtils;

//import org.demein.gmall.bean.UserAddress;

public class UserServiceStub implements UserService {
	
	private final UserService userService;
	

	/**
	 * 传入的是userService远程的代理对象
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}


	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub.....");
		if(!StringUtils.isEmpty(userId)) {
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}