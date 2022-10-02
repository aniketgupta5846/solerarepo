package hrmsapp.service;

import hrmsapp.dao.EmployeeDAO;
import hrmsapp.dao.EmployeeDaoImpl;
import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee addEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDaoImpl();
		Employee emp = employeeDao.addEmployee(employee);
		//Before returning any logic we can perform
		return emp;
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDaoImpl();
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDaoImpl();
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDaoImpl();
		return employeeDao.deleteEmployee(id);
		
	}
	
	//You can have any other methods also
}
