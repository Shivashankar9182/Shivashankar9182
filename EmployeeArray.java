//demonstration of 
package com.apjfsa;

 class Employe {
    String name;
    int id;
    String Department;

    // Constructor to initialize employee objects
    public Employe(String name, int id,String Department) {
        this.name = name;
        this.id = id;
        this.Department = Department;
    }

    // Method to print employee information
    public void printDetails() {
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Department: " +Department);
    }
}

public class EmployeeArray {

    public static void main(String[] args) {
        // Define the size of the employee array
        int size = 4;

        // Create an array of Employee objects
        Employe[] employees = new Employe[size];

        // Initialize employee objects using constructor
        employees[0] = new Employe("Shiva", 101,"Software Devoloper");
        employees[1] = new Employe("Azhar", 102,"Testing");
        employees[2] = new Employe("Ganesh",103,"WebDevoloper");
        employees[3] = new Employe("Arun",104,"IT analyst");

        // Print employee information
        System.out.println("Employee Details:");
        for (Employe employee : employees) {
            employee.printDetails();
            System.out.println(); 
        }
    }
}

