package com.spring.autowiring;

public class Himma implements People {
	//默认一天搬100块砖
	private Integer brickNum = 100;
	//默认填5个坑
	private Integer pitNum = 5;
	
	public Himma(){
		
	}
	
	public Himma(int brickNum){
		this.brickNum = brickNum;
	}
	
	public Himma(int brickNum, int pitNum){
		this.brickNum = brickNum;
		this.pitNum= pitNum;
	}
	
	public void doWorking() {
		System.out.println("今天搬了"+brickNum+"块砖,还填了"+pitNum+"个坑");
	}

	public void setBrickNum(Integer brickNum) {
		this.brickNum = brickNum;
	}

	public void setPitNum(Integer pitNum) {
		this.pitNum = pitNum;
	}
	
	
}
