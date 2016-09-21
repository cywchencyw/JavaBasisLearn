package com.proxy;

public class Test {

	public static void main(String[] args) {
//		Car car = new Car();
//		car.move();
		
		//继承实现静态代理
//		Moveable m = new Car2();
//		m.move();
		
		//聚合实现静态代理
//		Car car = new Car();
//		Moveable m = new Car3(car);
//		m.move();
		
		//日志和时间同时聚合实现静态代理
		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
	}

}
