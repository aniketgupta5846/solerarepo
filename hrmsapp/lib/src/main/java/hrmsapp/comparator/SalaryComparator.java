package hrmsapp.comparator;

import java.util.Comparator;

import hrmsapp.model.Employee;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getSalary().compareTo(o1.getSalary());	
	}
}
