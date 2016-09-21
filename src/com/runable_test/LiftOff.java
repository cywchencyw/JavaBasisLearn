/**
 *
 * 2016年8月26日
 */
package com.runable_test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Lynn.Hsu <handohand@vip.qq.com> 2016年8月26日
 *
 */
public class LiftOff implements Runnable {

	private int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "liftoff!") + "),";
	}

	// /**
	// * 2016年8月26日
	// */
	// public synchronized void test() {
	// while (countDown-- > 0) {
	// System.out.println(status());
	// }
	// }
	//
	// public synchronized void aa() {
	// System.out.println("aaa");
	// }
	//
	// public synchronized void bb() {
	// System.out.println("bbb");
	// }
	//
	// public synchronized void cc() {
	// System.out.println("ccc");
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(status());
			// Thread.yield();
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/**
	 * 2016年8月26日
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// LiftOff lf = new LiftOff();
		// lf.test();

		// lf.aa();
		// lf.bb();
		// lf.cc();
		// lf.run();
		// for (int i = 0; i < 5; i++) {
		// Thread t = new Thread(new LiftOff());
		// t.start();
		// System.out.println("waiting for liftoff");
		//
		// }
		// ExecutorService exec = Executors.newFixedThreadPool(5);
		ExecutorService exec = Executors.newCachedThreadPool();
		// ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}

}
