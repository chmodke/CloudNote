package org.kehao.note.test.dao.user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kehao.note.dao.CnUserDao;
import org.kehao.note.model.CnUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CnUserDaoTest {
	private CnUserDao userDao;
	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		userDao=(CnUserDao) ctx.getBean("cnUserDaoImpl",CnUserDao.class);
	}
	@After
	public void destory(){
		ctx.close();
	}
	@Test
	public void TestGetUserById(){
		CnUser user=userDao.getUserById("c400897c9c7146bea8e46cb5e2987bf6");
		System.out.println(user.getCnUserName());
	}
}
