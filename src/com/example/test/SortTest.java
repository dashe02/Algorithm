package com.example.test;
import com.example.sort.Sort;
public class SortTest {
  public static void main(String[] args) {
	  Sort s=new Sort();
	  int score[]={67,69,99,89,87,90,75,100};
	/*  s.BubbleSort(score);*/
	  /*s.SelectionSort(score);*/
	  s.InsertSort(score);
	  for(int a=0;a<score.length;a++){
			System.out.print(score[a]+" ");
		}
}
}
