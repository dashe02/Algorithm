package com.example.sort;

public class ArrayPar {
     //划分算法，第一个while循环在发现比枢纽大的数据项时退出，第二个循环在发现比枢纽小的数据项时退出。当两个
	//循环都退出之后,leftPtr和rightPtr都指着在数组的错误一方位置上的数据项，所以交换这两个数据项。
	//"三数据项取中"划分：选择第一项，最后一项和中间位置数据项的中值
	private long[] theArray;
    private int nElems;
    public ArrayPar(int max){
    	theArray=new long[max];
    	nElems=0;
    }
    public void insert(long value){
    	theArray[nElems]=value;
        nElems++;
    }
    public int size(){
    	return nElems;
    }
    public void display(){
    	System.out.println("A=");
        for(int j=0;j<nElems;j++)
        	System.out.println(theArray[j]+"");
          System.out.println("");
    }
    public int partitionIt(int left,int right,long pivot)
    {
    	int leftPtr=left-1;
    	int rightPar=right+1;
    	while(true){
    		while(leftPtr<right&&theArray[++leftPtr]<pivot);
    		while(rightPar>left&&theArray[--rightPar]>pivot);
    		if(leftPtr>=rightPar)
    			break;
    		else
    			swap(leftPtr,rightPar);
    	}
    	return leftPtr;
    }
    public void swap(int dex1,int dex2)
    {
    	long temp;
    	temp=theArray[dex1];
    	theArray[dex1]=theArray[dex2];
    	theArray[dex2]=temp;
    }
    
    
    
}
