package com.java8.in;

public class RemoveDuplicateelementInString {
	
	public static void main(String[] args) {	
    int a=0;
    int b=1;
  
   System.out.print(a+","+b+", ");
    for(int i=1;i<=10;i++) {
    	 int c =a+b;;//1
    	a=b; //1
    	b=c;//1
    	System.out.print(c+",");
    }
	}
}
