package com.example.sort;

public class ShellSort {

	public static void shellSort(int[] arr){
		int  j;
		int len=arr.length;
		for(int val=len>>1;val>0;val>>=1){
		for(int i=val;i<len;i++){
			int temp=arr[i];
			/*
			 * 为什么每次都用temp比较呢？
			 * 因为直接插入就是找到temp的合适位置。
			 * 为什么temp<arr[j-val]这个条件可以放在for内呢？
			 * 因为原来的组内数据已经有序，找到位置就停止便是。
			 * 不甚理解的去看直接插入排序吧。
			 */
			for(j=i;j>val&&temp<arr[j-val];j-=val){
				/*
				 * 为什么是arr[j-val]不是arr[j]呢？
				 * 因为j=i开始的，而且条件是j>=val&&temp<arr[j-val]
				 */
				arr[j]=arr[j-val];
			}
			/*
			 * 注意不是arr[i] = temp
			 * 直接插入排序也是这样的。
			 * 为什么呢？
			 * 因为j是位置，i是待插入元素
			 */
			arr[j]=temp;
		}		
		}
	}
}
