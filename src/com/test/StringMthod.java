/**
 *
 * 2016年8月11日
 */
package com.test;

/**
 * @author fangl 2016年8月11日
 *
 */
public class StringMthod {
	
	public static void main(String[] args) {
		
		String aaa = "asdfghjkl";
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append(aaa);
		String bbb = stringbuffer.insert(1, aaa).toString();
		System.out.println(bbb);
		StringBuilder builder = new StringBuilder();
		builder.append(aaa);
		String ccc = builder.insert(1, aaa).toString();
		System.out.println(ccc);
	}
	
}
