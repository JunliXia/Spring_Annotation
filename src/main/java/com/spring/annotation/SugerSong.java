package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class SugerSong implements Song{

	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("I'm hurtin baby, I'm broken down...I need your lovin, lovin I need it now...");
	}
}
