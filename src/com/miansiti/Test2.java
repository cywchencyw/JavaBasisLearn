package com.miansiti;

import java.util.ArrayList;
import java.util.List;
/**
 * 求一个集合的全排列
 * @author think
 *
 */
public class Test2 {
	
	 static List<int[]> allSorts = new ArrayList<int[]>();
     
	    public static void permutation(int[] nums, int start, int end) {
	        if (start == end) { // 当只要求对数组中一个数字进行全排列时，只要就按该数组输出即可
	            int[] newNums = new int[nums.length]; // 为新的排列创建一个数组容器
	            for (int i=0; i<=end; i++) {
	                newNums[i] = nums[i];
	            }
	            allSorts.add(newNums); // 将新的排列组合存放起来
	        } else {
	            for (int i=start; i<=end; i++) {
	                int temp = nums[start]; // 交换数组第一个元素与后续的元素
	                nums[start] = nums[i];
	                nums[i] = temp;
	                permutation(nums, start + 1, end); // 后续元素递归全排列
	                nums[i] = nums[start]; // 将交换后的数组还原
	                nums[start] = temp;
	            }
	        }
	    }
	    
	public static void main(String[] args) {
		 int[] numArray = {1,2,3,4,5,6,7,8,9};
	        permutation(numArray, 0, numArray.length - 1);
	        int[][] a = new int[allSorts.size()][]; // 你要的二维数组a
	        allSorts.toArray(a);
	             
	        // 打印验证
	        for (int i=0; i<a.length; i++) {
	            int[] nums = a[i];
	            for (int j=0; j<nums.length; j++) {
	                System.out.print(nums[j]);
	            }
	            System.out.println();
	        }
	        System.out.println(a.length);
	}

}
