package hrmsapp.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hrmsapp.comparator.SalaryComparator;
import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Address;
import hrmsapp.model.Employee;
import hrmsapp.service.EmployeeService;
import hrmsapp.service.EmployeeServiceImpl;

public class HRMSMainApp {

	public static void main(String[] args) {
		Address address = new Address();
		address.setId(1);
		address.setHouseNo(982);
		address.setStreet("SB Compound");
		address.setCity("Bhiwandi");
		address.setCountry("India");
		address.setState("Maharashtra");
		address.setZipcode(121111L);
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Aniket");
		emp.setSalary(400000.0);
		emp.setDateOfBirth(LocalDate.of(2001, 04, 03));
		emp.setAddress(address);
		
		Address address1 = new Address();
		address1.setId(2);
		address1.setHouseNo(111);
		address1.setCity("Bhavnagar");
		address1.setCountry("India");
		address1.setState("Gujarat");
		address1.setStreet("Modi Gali");
		address1.setZipcode(121111L);
		
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("Arun");
		emp1.setSalary(500000.0);
		emp1.setDateOfBirth(LocalDate.of(2002, 04, 03));
		emp1.setAddress(address1);
		
		Employee emp3 = new Employee(3, "Sai", null, null, address1);		
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(employeeService.addEmployee(emp));
		listOfEmployees.add(employeeService.addEmployee(emp1));
		
		System.out.println(listOfEmployees);
		System.out.println("******Get the Employee******");
		try {
			Employee e = employeeService.getEmployeeById(1);
			System.out.println(e);
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("***Update******");
		try {
			Employee e1 = employeeService.updateEmployee(emp);
			e1.setSalary(40000.0);
			System.out.println(e1);
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("***Delete******");
		try {
			String e2 = employeeService.deleteEmployee(1);
			System.out.println(e2);
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("********Salary Comparision*************");
		System.out.println(listOfEmployees);
		Collections.sort(listOfEmployees, new SalaryComparator());
		System.out.println(listOfEmployees);
		
		
		System.out.println("*****Passing the method refernce to comparing method of comparator*******");
		listOfEmployees.stream().forEach(Employee::getSalary);
		Collections.sort(listOfEmployees,Comparator.comparing(Employee::getSalary));
		listOfEmployees.forEach(System.out::println);
	}

}
