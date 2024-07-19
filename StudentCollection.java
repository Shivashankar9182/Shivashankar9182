package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollection {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(new Student(97,"Shiva","MCA"));
		list.add(new Student(91,"Azhar","MBA"));
		list.add(new Student(103,"Ganesh","Btech"));
		list.add(new Student(99,"Arun","MCA"));
		
		Student s=new Student(345,"Giri","BCA");
		list.add(s);
		
		for(Student s1:list) {
			System.out.println(s1);
		}
		Collections.sort(list);
		
		for(Student s1:list) {
			System.out.println(s1);
		}
	}

}
