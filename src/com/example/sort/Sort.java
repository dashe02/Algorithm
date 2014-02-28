package com.example.sort;

import java.net.Inet4Address;

public class Sort {
	public void BubbleSort(int[] score){
		//冒泡排序法，就是依次比较一个数组中的相邻的两个值
		for(int i=0;i<score.length-1;i++){
			for(int j=0;j<score.length-i-1;j++){
				if(score[j]>score[j+1]){
					int temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}
			}
			}
		
	}
	public void SelectionSort(int[] score){
		//每一次从待排序的数据元素中选出最小或者最大的一个元素，顺序放在已排好序的数列的最后，直到全部待排序的数组元素排完。
		int i,j;
		int temp;
		for(i=0;i<score.length-1;i++){
			int min=i;
			for(j=i+1;j<score.length;j++){
				if(score[min]>score[j]){
					min=j;
				}
			}
			temp=score[min];
			score[min]=score[i];
			score[i]=temp;	
		}
	}
	public void InsertSort(int[] score){
		//把n个待排序的元素看成一个有序表和一个无序表，开始有序表只包含一个元素，无序表中包含n-1个元素，排序过程中每次从无序
		//表中取出第一个元素，把它的排序码依次与有序表中元素的排序码进行比较，将它插入到有序表中的适当位置，使之成为新的有序表。
		for(int i=1;i<score.length;i++){
			int insertval=score[i];
			 // insertValue准备和前一个数比较
			int index=i-1;
			while(index>=0&&insertval<score[index]){
			//  将把score[index]向后移动
				score[index+1]=score[index];
				//让index相前移动一位
				index--;
			}
			//将insertvalue插入到适当位置
			score[index+1]=insertval;
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
