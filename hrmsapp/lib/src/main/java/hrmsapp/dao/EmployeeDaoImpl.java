package hrmsapp.dao;

import java.util.Set;
import java.util.TreeSet;

import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	private static Set<Employee> setOfEmployees = new TreeSet<Employee>();
	@Override
	public Employee addEmployee(Employee employee) {	
		setOfEmployees.add(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
		for(Employee emp :setOfEmployees) {
			if(emp.getId()==id) {	
				return emp;
			}		
		}
		throw new EmployeeNotFoundException("Employee with id "+id+" not found");
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		for(Employee emp :setOfEmployees) {
			if(emp.equals(employee)) {	
				return emp;
			}		
		}
		throw new EmployeeNotFoundException("Employee with id  not found");
	}

	@Override
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException {
		for(Employee emp :setOfEmployees) {
			if(emp.getId()==id) {
				setOfEmployees.remove(emp);	
				return id+" Deleted";
			}	
		}
		throw new EmployeeNotFoundException("Employee with id  not found");
		
	}
}
