package com.apjfsa;

//This enum defines the different departments within a company.
enum Department {
    SALES,
    ENGINEERING,
    MARKETING,
    FINANCE,
    HUMAN_RESOURCES;
}

public class EnumDepartment {

	public static void main(String[] args) {
		
		// Create department objects for employees
		Department emp1=Department.ENGINEERING;
        Department emp2=Department.MARKETING;
        Department emp3=Department.FINANCE;
        Department emp4=Department.ENGINEERING;

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp1.equals(emp4));
        System.out.println(emp2.compareTo(emp4));
        System.out.println(emp3.name());
        System.out.println(emp2.compareTo(emp4));
        System.out.println(emp4.equals(emp2));
        System.out.println(emp1.compareTo(emp3));
    }
}