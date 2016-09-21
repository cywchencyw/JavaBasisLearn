package com.cglibproxy;

public class TestCglib {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		Train t = (Train)proxy.getProxy(Train.class);
		t.move();
	}

}
