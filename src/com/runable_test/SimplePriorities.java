/**
 *
 * 2016年8月26日
 */
package com.runable_test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Lynn.Hsu <handohand@vip.qq.com> 2016年8月26日
 *
 */
public class SimplePriorities implements Runnable {

	private int countDown = 5;
	private volatile double d;
	private int priority;

	public SimplePriorities(int priority) {
		this.priority = priority;
	}

	public String toString() {
		Thread.currentThread().setName("chenyawei");
		return Thread.currentThread() + ":" + countDown;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);
		while (true) {
			// for (int i = 1; i < 10000; i++) {
			// d += (Math.PI + Math.E) / (double) i;
			// if (i % 1000 == 0)
			// Thread.yield();
			// }
			System.out.println(this);
			if (--countDown == 0)
				return;
		}
	}

	/**
	 * 2016年8月26日
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.shutdown();
	}
}
