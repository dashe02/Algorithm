package com.example.sort;

public class ArrayIns {

	//快速排序算法本质上通过把一个数组划分为两个子数组，然后递归
	//地调用自身为每一个子数组进行快速排序来实现的。
	
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
