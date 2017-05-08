package com.spring.annotation;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.annotation.People;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/Spring-annotation.xml"})
public class AnnotationTest {
	
	@Resource
	private People people;
	
	
	@Test
	public void testAnnotation(){
		people.doWorking();
	}
	
}
