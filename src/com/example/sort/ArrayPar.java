package com.example.sort;

public class ArrayPar {
     //�����㷨����һ��whileѭ���ڷ��ֱ���Ŧ���������ʱ�˳����ڶ���ѭ���ڷ��ֱ���ŦС��������ʱ�˳���������
	//ѭ�����˳�֮��,leftPtr��rightPtr��ָ��������Ĵ���һ��λ���ϵ���������Խ��������������
	//"��������ȡ��"���֣�ѡ���һ����һ����м�λ�����������ֵ
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
