package com.example.sort;

import java.net.Inet4Address;

public class Sort {
	public void BubbleSort(int[] score){
		//ð�����򷨣��������αȽ�һ�������е����ڵ�����ֵ
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
		//ÿһ�δӴ����������Ԫ����ѡ����С��������һ��Ԫ�أ�˳��������ź�������е����ֱ��ȫ�������������Ԫ�����ꡣ
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
		//��n���������Ԫ�ؿ���һ��������һ���������ʼ�����ֻ����һ��Ԫ�أ�������а���n-1��Ԫ�أ����������ÿ�δ�����
		//����ȡ����һ��Ԫ�أ��������������������������Ԫ�ص���������бȽϣ��������뵽������е��ʵ�λ�ã�ʹ֮��Ϊ�µ������
		for(int i=1;i<score.length;i++){
			int insertval=score[i];
			 // insertValue׼����ǰһ�����Ƚ�
			int index=i-1;
			while(index>=0&&insertval<score[index]){
			//  ����score[index]����ƶ�
				score[index+1]=score[index];
				//��index��ǰ�ƶ�һλ
				index--;
			}
			//��insertvalue���뵽�ʵ�λ��
			score[index+1]=insertval;
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
