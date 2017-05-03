package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Himma.xml");
		People xiaoming = (People)applicationContext.getBean("xiaoMing");
		xiaoming.doWorking();
		
		People xiaohong = (People)applicationContext.getBean("xiaoHong");
		xiaohong.doWorking();
		
		People xiaogang = (People)applicationContext.getBean("xiaoGang");
		xiaogang.doWorking();
	}
}
