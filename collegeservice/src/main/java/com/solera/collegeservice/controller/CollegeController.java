package com.solera.collegeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solera.collegeservice.entities.College;
import com.solera.collegeservice.entities.Student;
import com.solera.collegeservice.exceptions.CollegeNotFoundException;
import com.solera.collegeservice.exceptions.StudentNotFoundException;
import com.solera.collegeservice.service.CollegeService;

@RestController
@RequestMapping("/api/v1/college")
public class CollegeController {
	@Autowired
	private CollegeService collegeService;
	
	@GetMapping("/collegedetail/{collegeId}")
	public College getCollegeById(@PathVariable Integer collegeId) throws CollegeNotFoundException {
		
		return collegeService.retrieveCollegeById(collegeId);
	}
	
	@GetMapping("/student")
	public Student getStudentById(@RequestParam("studentId") Integer studentId) throws StudentNotFoundException {
		
		return collegeService.retrieveStudentById(studentId);
	}
	
	@GetMapping("/students")
	public List<Student> retrieveStudentsByCollegeId(@RequestParam("collegeId") Integer collegeId) throws StudentNotFoundException{
		return collegeService.retrieveStudentsByCollegeId(collegeId);
	}
	
	@PostMapping("/newCollege")
	public College insertCollege(College college) {
		
		return collegeService.insertCollege(college);
	}
	@PostMapping("/newStudent")
	public Student insertStudent(Student student) {
		
		return collegeService.insertStudent(student);
	}
	
	
}