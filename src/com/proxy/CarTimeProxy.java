package com.proxy;

public class CarTimeProxy implements Moveable {
	
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}
	private Moveable m;
	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶......");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶结束。汽车行驶时间："+(endTime-startTime));
	}

}
