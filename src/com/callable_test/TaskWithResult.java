/**
 *
 * 2016年8月26日
 */
package com.callable_test;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Lynn.Hsu <handohand@vip.qq.com> 2016年8月26日
 * chenyawei
 *
 */
public class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public String call() throws Exception {
		return "result of TaskWithResult " + id;
	}

	/**
	 * 2016年8月26日
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++)
			results.add(exec.submit(new TaskWithResult(i)));
		for (Future<String> fs : results)
			try {
				System.out.println(fs.isDone());
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				System.out.println(e);
				return;
			} catch (ExecutionException e) {
				System.out.println(e);
				return;
			} finally {
				exec.shutdown();
			}
	}
}
