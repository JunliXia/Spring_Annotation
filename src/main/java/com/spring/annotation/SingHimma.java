package com.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SingHimma extends Himma{
	@Resource(name = "fadedSong")
	private Song song;

	@Value("${brickNum}")
	private String brickNum;

	public SingHimma() {

	}

	public SingHimma(Song song) {
		this.song = song;
	}
	
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("开始上班了");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("下班了");
	}


	@Override
	public void doWorking() {
		// TODO Auto-generated method stub
		super.setBrickNum(Integer.parseInt(brickNum));
		super.doWorking();
		System.out.println("开始唱歌。。");
		song.sing();
	}

	public void setSong(Song song) {
		this.song = song;
	}

}
