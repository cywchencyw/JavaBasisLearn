/**
 *
 * 2016年8月16日
 */
package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author fangl 2016年8月16日
 *
 */
public class ForeachMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1","value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		//foreach遍历数组keySet()方法
		for(String key:map.keySet()){
			System.out.println("键名"+key+"and 值"+map.get(key));
		}
		
		//foreach遍历数组entrySet()方法
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println("键名："+entry.getKey()+"值："+entry.getValue());
		}
		
		//foreach遍历数组values()方法
		for(String str:map.values()){
			System.out.println("值："+str);
		}
		
		//迭代器遍历数组
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry = it.next();
			System.out.println("键名："+entry.getKey()+"值："+entry.getValue());
		}
		
	}
	
	
}
