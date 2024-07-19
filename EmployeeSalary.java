// Super class Employee
class Employee {
    // Void method to print total salary, to be overridden in child classes
    public void total_Salary() {
        System.out.println("Calculating salary for Employee:");
    }
}

// Child class PermanentEmployee
class PermanentEmployee extends Employee {
     int basicSalary;
     int benefits;

    public PermanentEmployee(int basicSalary, int benefits) {
        this.basicSalary = basicSalary;
        this.benefits = benefits;
    }

    // Overriding the total_Salary method for PermanentEmployee
    @Override
    public void total_Salary() {
        double totalSalary = basicSalary + benefits;
        System.out.println("Calculating salary for Permanent Employee: " + totalSalary);
    }
}

// Child class ContractEmployee
class ContractEmployee extends Employee {
     double hourlyRate;
     int hoursWorked;

    public ContractEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Overriding the total_Salary method for ContractEmployee
    @Override
    public void total_Salary() {
        double totalSalary = hourlyRate * hoursWorked;
        System.out.println("Calculating salary for Contract Employee: " + totalSalary);
    }
}

// Main class to test the method overriding
public class EmployeeSalary {
    public static void main(String[] args) {
        // Creating instances of Employee, PermanentEmployee, and ContractEmployee
        Employee emp = new Employee();
        PermanentEmployee permEmp = new PermanentEmployee(40000, 10000);
        ContractEmployee contEmp = new ContractEmployee(250, 160);

        // Calling the total_Salary method for each instance
        emp.total_Salary();
        permEmp.total_Salary();
        contEmp.total_Salary();
    }
}
