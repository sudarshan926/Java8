package com.java8.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private double sallary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSallary() {
		return sallary;
	}
	public void setSallary(double sallary) {
		this.sallary = sallary;
	}
	public Employee(int id, String name, double sallary) {
		super();
		this.id = id;
		this.name = name;
		this.sallary = sallary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sallary=" + sallary + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<Integer>();
	List<Integer>l1=Arrays.asList(20,45,56,55,33,70);
	
		li.add(20);
		li.add(40);
		li.add(50);
		li.add(45);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println(l1.get(1));
		
	}
	

}
