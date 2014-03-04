package com.example.sort;

public class ShellSort {

	public static void shellSort(int[] arr){
		int  j;
		int len=arr.length;
		for(int val=len>>1;val>0;val>>=1){
		for(int i=val;i<len;i++){
			int temp=arr[i];
			/*
			 * Ϊʲôÿ�ζ���temp�Ƚ��أ�
			 * ��Ϊֱ�Ӳ�������ҵ�temp�ĺ���λ�á�
			 * Ϊʲôtemp<arr[j-val]����������Է���for���أ�
			 * ��Ϊԭ�������������Ѿ������ҵ�λ�þ�ֹͣ���ǡ�
			 * ��������ȥ��ֱ�Ӳ�������ɡ�
			 */
			for(j=i;j>val&&temp<arr[j-val];j-=val){
				/*
				 * Ϊʲô��arr[j-val]����arr[j]�أ�
				 * ��Ϊj=i��ʼ�ģ�����������j>=val&&temp<arr[j-val]
				 */
				arr[j]=arr[j-val];
			}
			/*
			 * ע�ⲻ��arr[i] = temp
			 * ֱ�Ӳ�������Ҳ�������ġ�
			 * Ϊʲô�أ�
			 * ��Ϊj��λ�ã�i�Ǵ�����Ԫ��
			 */
			arr[j]=temp;
		}		
		}
	}
}
