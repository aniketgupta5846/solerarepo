package com.solera.collegeservice.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="student_details")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	private String studentName;
	
	@ManyToOne(cascade = CascadeType.ALL)//Owning side
	@JoinColumn(name = "collegeId")
	@Exclude
	private College college;
}