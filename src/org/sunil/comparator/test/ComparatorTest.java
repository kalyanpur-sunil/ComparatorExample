package org.sunil.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.sunil.compartor.EmployeeComparator;
import org.sunil.model.Employee;

public class ComparatorTest {

	public static void main(String[] args) {

		//create some employees
		Employee emp1 = new Employee(1, "name1");
		Employee emp2 = new Employee(2, "name2");
		Employee emp5 = new Employee(5, "name5");
		Employee emp3 = new Employee(3, "name3");
		Employee emp4 = new Employee(4, "name4");

		//add all employees to a list

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp5);
		empList.add(emp3);
		empList.add(emp4);

		//print all employees from list
		System.out.println("*BEFORE SORTING*");
		
		for(Employee emp: empList){
			System.out.println(emp);
		}
		
		System.out.println();
		
		//sort list using Comparator
		Collections.sort(empList, new EmployeeComparator());

		//print all employees from list
		System.out.println("*AFTER SORTING*");
		
		for(Employee emp: empList){
			System.out.println(emp);
		}
		System.out.println();

		Collections.sort(empList, Collections.reverseOrder(new EmployeeComparator()));
		
		//print all employees from list
		System.out.println("*SORTING IN REVERSE ORDER*");
		for(Employee emp: empList){
			System.out.println(emp);
		}
	}

}
