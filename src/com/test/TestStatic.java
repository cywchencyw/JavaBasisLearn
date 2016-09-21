/**
 *
 * 2016年8月11日
 */
package com.test;

/**
 * @author fangl 2016年8月11日
 *
 */
public class TestStatic {
	 private static int a;
     private int b;

     static {
    	 	TestStatic.a = 3;
             System.out.println(a);
             TestStatic t = new TestStatic();
             t.f();
             t.b = 1000;
             System.out.println(t.b);
     }

     static {
    	 	TestStatic.a = 4;
             System.out.println(a);
     }

     public static void main(String[] args) {
             // TODO 自动生成方法存根
     }

     static {
    	 	TestStatic.a = 5;
             System.out.println(a);
     }

     public void f() {
             System.out.println("hhahhahah");
     } 
}
