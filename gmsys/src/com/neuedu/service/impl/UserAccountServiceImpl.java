package com.neuedu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.UserAccountMapper;
import com.neuedu.model.UserAccount;
import com.neuedu.service.UserAccountService;

@Service
@Transactional
public class UserAccountServiceImpl implements UserAccountService{
	@Resource
	private UserAccountMapper userAccountMapper;
	@Override
	public UserAccount findUserByAccount(String account) {
		// TODO 自动生成的方法存根
		return userAccountMapper.findUserByAccount(account);
	}

}
