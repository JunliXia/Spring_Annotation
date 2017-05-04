package com.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingHimmaTest {

	ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"Spring-SingHimma.xml");
	}

	@Test
	public void testxiaoXia() {
		People xiaoXia = (People) applicationContext.getBean("xiaoXia");
		xiaoXia.doWorking();
	}
	
	@Test
	public void testxiaoHong() {
		People xiaoHong = (People) applicationContext.getBean("xiaoHong");
		xiaoHong.doWorking();
	}
	
	@Test
	public void testxiaoGang() {
		People xiaoGang = (People) applicationContext.getBean("xiaoGang");
		xiaoGang.doWorking();
	}
		

	@After
	public void destroy() {
		// 关闭容器，演示destory-method
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
