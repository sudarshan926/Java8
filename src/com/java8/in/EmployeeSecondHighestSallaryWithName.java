package com.java8.in;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EmployeeSecondHighestSallaryWithName {

	public static void main(String[] args) {
		
		List<Employee>li=Arrays.asList
		(
		new Employee(1,"Akash",35000.00),
		new Employee(2,"Ganesh",45000.00),
		new Employee(3,"Sunil",22000.00),
		new Employee(4,"Vikas",95000.00),
		new Employee(5,"Mahesh",70000.00)
			
		);
		
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li.get(1));
//		
//	System.out.println(li.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).distinct().skip(1).findFirst().map(n->n.getName()+"- "+n.getSallary()+" - "+n.getId()));
//	String s=li.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).distinct().skip(1).findFirst().map(n->n.getName()+"- "+n.getSallary()+" - "+n.getId()).orElse("");
//	System.out.println(s);
	//System.out.println(s);
	}

}
