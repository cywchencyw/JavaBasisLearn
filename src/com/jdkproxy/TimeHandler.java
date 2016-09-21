package com.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	private Object target;
	
	public TimeHandler(Object object) {
		super();
		this.target = object;
	}

	/*
	 * proxy 被代理的对象
	 * method 被代理对象的方法
	 * args 方法的参数
	 * 
	 * Object 返回值
	 * 
	 * 动态代理实现思路
	 * 现实功能：通过Proxy的newProxyInstance返回代理对象
	 * 1、声明一段源码（动态产生代理）
	 * 2、编译源码（jdk compiler api）,产生新的类（代理类）
	 * 3、将这个load到内存当中，产生一个新的对象（代理对象）
	 * 4、return 代理对象
	 * (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶......");
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶结束。汽车行驶时间："+(endTime-startTime));
		return null;
	}

}
