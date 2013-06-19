package org.sunil.compartor;

import java.util.Comparator;

import org.sunil.model.Employee;

/**
 * 
 * @author Sunil Kalyanpur
 *
 */
public class EmployeeComparator implements Comparator<Employee>{

	public int compare(Employee emp1, Employee emp2){
		return emp1.getName().compareTo(emp2.getName());
	}
}
