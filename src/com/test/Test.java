/**
 *
 * 2016年8月11日
 */
package com.test;

/**
 * @author fangl 2016年8月11日
 *
 */
public class Test {

	/**
	 * 2016年8月11日
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// int l = 6;
		// l += l-1;
		// l = l+(l-1);
		String s = "Gone with the wind";
		// StringBuffer k = new StringBuffer(s);
		// String t ;
		// t= k.charAt(3)+"one";
		// String t = s+"wind";
		// System.out.println("".equals(null));
		// String aa = "asdfghj";
		// StringBuffer bb = new StringBuffer(aa);
		// bb.append("0000000000");
		//
		// int sum=0;
		// int cheng = 1;
		// for(int i=1;i<=4;i++){
		// for(int j=i;j>=1;j--){
		// cheng *=j;
		// }
		// sum +=cheng;
		// cheng = 1;
		// }
		// System.out.println(sum);

		String aa = "iuwljsapladhfahlkmnhfhjksdqpajlajf";
		String cc = "aj";
		int count = 0;
		for (int i = 0; i < aa.length() - 1; i++) {
			String ss = aa.substring(i, i + 2);
			if (cc.equals(ss)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
