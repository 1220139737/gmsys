package com.neuedu.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.UserAccountMapper;
import com.neuedu.model.UserAccount;
import com.neuedu.service.UserAccountService;

@RunWith(SpringJUnit4ClassRunner.class)  //ʹ��junit 4���в���
@ContextConfiguration("classpath:config/spring-common.xml")//Spring����JUnit4����ʱ��ʹ��ע�����������ļ�
public class UserAccountMapperTest {
	@Autowired
	UserAccountService userAccountMapper;
	private static Logger logger = Logger.getLogger(UserAccountMapperTest.class);  

	@Transactional
	@Test
	public void testFindUserByAccount() {
		UserAccount userAccount = userAccountMapper.findUserByAccount("admin");
		logger.info(userAccount.getUserName());
		System.out.println(userAccount.getUserName());
	}

}
