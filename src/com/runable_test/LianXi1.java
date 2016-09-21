/**
 *
 * 2016年8月26日
 */
package com.runable_test;

/**
 * @author Lynn.Hsu <handohand@vip.qq.com> 2016年8月26日
 *
 */
public class LianXi1 implements Runnable {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("I am run!");
			Thread.yield();
		}
	}

	/**
	 * 2016年8月26日
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new LianXi1());
		t.start();
	}

}
