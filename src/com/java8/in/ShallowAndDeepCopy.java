package com.java8.in;

 class AB implements Cloneable{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "ShallowAndDeepCopy [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();	
	}
 }
public class ShallowAndDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		AB s=new AB();
		s.i=10;
		s.j=20;
		AB s1=new AB();
		s1=s;// shallow copy
		System.out.println(s1);
		s1.i=s.i;
		s1.j=s.j;
		
		s1= (AB)s.clone();
    System.out.println(s);
    System.out.println(s1);
	}

}
