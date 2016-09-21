/**
 *
 * 2016年8月10日
 */
package com.test;

/**
 * @author fangl 2016年8月10日
 *
 */
public class TestMain extends TestAbstract {

	/**
	 * 2016年8月10日
	 * @param args
	 */
	public static void main(String[] args) {
//		Singleton.getInstance();
//		People p = Factory.create(1);
//		p.say();
//		p = Factory.create(2);
//		p.say();
		System.out.println(num);
		TestMain tt = new TestMain();
		tt.testMethod();
		
	}

	/* (non-Javadoc)
	 * @see com.test.TestAbstract#testMethod()
	 */
	@Override
	public void testMethod() {
		System.out.println("print abstract00000000000");
	}
	
	

}
