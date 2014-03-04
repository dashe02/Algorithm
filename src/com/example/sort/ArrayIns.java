package com.example.sort;

public class ArrayIns {

	//���������㷨������ͨ����һ�����黮��Ϊ���������飬Ȼ��ݹ�
	//�ص�������Ϊÿһ����������п���������ʵ�ֵġ�
	
	private long[] theArray;
	private int nElems;
	
	public ArrayIns(int max)
	{
		theArray=new long[max];
		nElems=0;
    }
	public void insert(long value)
	{
		theArray[nElems]=value;
		nElems++;	
	}
	public void display(){
		System.out.println("A=");
		for(int j=0;j<nElems;j++)
		 System.out.println(theArray[j]+"");
		System.out.println("");
	}
	public void quickSort()
	{
		recQuickSort(0,nElems-1);
	}
	private void recQuickSort(int left, int right) {
		if(right-left<=0)
			return;
		else{
			long pivot=theArray[right];
			int partition=partitionIt(left,right,pivot);
			recQuickSort(left, partition-1);
			recQuickSort(partition+1, right);	
		}
	}
	private int partitionIt(int left, int right, long pivot) {
	   int leftPtr=left-1;
	   int rightPtr=right+1;
	   while(true)
	   {
		   while(theArray[++leftPtr]<pivot);
		   while(rightPtr>0&&theArray[--rightPtr]>pivot);
		   if(leftPtr>=rightPtr)
			   break;
		   else 
			   swap(leftPtr,rightPtr);
			   
	   }
		return leftPtr;
	}
	private void swap(int dex1, int dex2) {
		long temp=theArray[dex1];
		theArray[dex1]=theArray[dex2];
		theArray[dex2]=temp;
		
	}
	
	
	
}
