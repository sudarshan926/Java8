package com.java8.in;

interface C{
	static void add(int a, int b) {
		System.out.println("Addition :"+(a+b));
	}
}
interface D{
	static void add(int a, int b) {
		System.out.println("Addition : "+(a+b));
	}	
}
public class StaticMethods implements C,D {
	static void add() {
		System.out.println("Main class :");
	}
	public static void main(String[] args) {
		
		StaticMethods.add();
		C.add(20,30);
		D.add(30,40);
	}
}
