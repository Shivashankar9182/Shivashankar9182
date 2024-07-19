//Demonstration of Modifiers(public,private,protected and default)
package com.apjfsa;

class Student {

	  // only accessible within Student
	  private int id;

	  // accessible from anywhere
	  public String name;

	  // accessible within the same (default)
	  int grade;

	  // accessible within Student and subclasses
	  protected String program;

	  // Public constructor to initialize name and ID
	  public Student(String name, int id,String program) {
	    this.name = name;
	    this.id = id;
	    this.program=program;
	  }
	  
	  void grade() {
		  if(grade>=0 && grade<=100) {
			  this.grade=grade;
		  }
		  else {
			  System.out.println("Invalid grade. Please enter a value between 0 And 100");
		  }
	  }

	  // Public method to get student details 
	  public void getDetails() {
	   System.out.println("Student Name: " + name + "\nID: " + id + "\nProgram: " + program+"\nGrade:"+grade);
	
	  }
	}

	// Subclass extending Student (can access protected program)
	class CSStudent extends Student {

	  public CSStudent(String name, int id, String program) {
	    super(name, id, program);  // Calling superclass constructor
	    this.program = program;
	  }
	}
	 
public class Modifiers {

	public static void main(String[] args) {
		Student stu1 = new Student("Shiva", 1234,"Computer Science");
		stu1.grade=82;
	    CSStudent Stu = new CSStudent("Azhar", 5678, "Computer Science");
	    Stu.grade=59;
	    stu1.getDetails();
	    Stu.getDetails();

	 
	}

}
