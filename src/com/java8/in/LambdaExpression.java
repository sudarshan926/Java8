package com.java8.in;

interface M{
	public void sub(int a,int d);
}
public class LambdaExpression {

	public static void main(String[] args) {
		
		  M a = (t,d) -> { System.out.println("sub :"+(t-d));
		  
		 };
		 a.sub(23,12);
		
	}
}
