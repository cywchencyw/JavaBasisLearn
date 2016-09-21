/**
 *
 * 2016年8月10日
 */
package com.test;

/**
 * 单例模式
 * @author fangl 2016年8月10日
 *
 */
public class Singleton {
	private static final Singleton instance = new Singleton();
	private Singleton(){System.out.println("nihao");}
	public static Singleton getInstance(){
		return instance;
	}
}


