package hrmsapp.service;

import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public interface EmployeeService {
	//Create
		public Employee addEmployee(Employee employee);
		
		//Retrive
		public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;
		
		//Update
		public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
		
		//
		public String deleteEmployee(Integer id) throws EmployeeNotFoundException;
}
