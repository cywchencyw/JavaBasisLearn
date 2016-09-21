/**
 *
 * 2016年8月10日
 */
package com.test;

/**
 * 工厂模式
 * @author fangl 2016年8月10日
 *
 */
public class Factory {
	public static People create(int type){
		if(type == 1){
			return new Chinese();
		}else if(type == 2){
			return new English();
		}else{
			return null;
		}
		
	}
}
