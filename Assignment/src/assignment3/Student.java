package assignment3;

import java.util.ArrayList;
import java.util.Collections;

class Student
{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public static void main(String[] args) {
	ArrayList cgpa = new ArrayList();
	Collections.sort(cgpa);
	Collections.reverse(cgpa);
	System.out.println(cgpa);
}
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}