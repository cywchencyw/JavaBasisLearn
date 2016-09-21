/**
 *
 * 2016年8月19日
 */
package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author Lynn.Hsu <handohand@vip.qq.com> 2016年8月19日
 *
 */

public class write {
	public static void main(String[] args) {
		write("E://123.json", "sdfsadas");
	}

	public static void write(String path, String content) {
		try {
			File f = new File(path);
			System.out.println("文件内容：" + content);
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			output.write(content);
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
