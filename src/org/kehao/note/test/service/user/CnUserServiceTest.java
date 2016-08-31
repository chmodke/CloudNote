package org.kehao.note.test.service.user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kehao.note.model.CnUser;
import org.kehao.note.service.CnUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CnUserServiceTest {
	private CnUserService userService;
	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		userService=(CnUserService) ctx.getBean("cnUserServiceImpl",CnUserService.class);
	}
	@After
	public void destory(){
		ctx.close();
	}
	@Test
	public void TestGetUserById(){
		CnUser user=userService.getUserById("c400897c9c7146bea8e46cb5e2987bf6");
		System.out.println(user.getCnUserName());
	}
}
