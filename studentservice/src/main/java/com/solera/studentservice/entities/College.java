package com.solera.studentservice.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="college_details")
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer collegeId; 
	private String collegeName; 
	private String address;
	@OneToMany(mappedBy = "college") //inverse side
	@Exclude
	private List<Student> student;

}
