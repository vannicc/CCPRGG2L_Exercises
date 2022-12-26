public class Employee {
    
    // Attributes
    String ID, firstName, lastName;
    double salary, percent;

    public static void main(String[] args) {
    
    Employee Employee1 = new Employee(); // Employee 1
        Employee1.ID = "20-10298"; // employee ID
        Employee1.salary = 25000.00; // base salary
        Employee1.raiseSalary(0.15); // salary increase
        

        

    Employee Employee2 = new Employee(); // Employee 2
        Employee2.firstName = "Cassandra"; // first name
        Employee2.lastName = "Lopez"; // last name 
        Employee2.salary = 30000.00; // base salary
        Employee2.raiseSalary(0.10); // salary increase




        Employee1.getID(); // method call to print employee ID
        Employee2.getName(); // method call to display name
        Employee1.getSalary(); // method call to display salary of employee 1
        Employee2.getSalary(); // method call to display salary of employee 2
        Employee1.getAnnualSalary(); // method call to display annual salary of employee 1
        Employee2.getAnnualSalary(); // method call to display the annual salary of employee 2
        
        
    }

    public void getID() { // method to print the employee's ID
        System.out.println("Employee ID: " + ID);
    }

    public void getName() { // method to print the employee's full name
        System.out.println("Employee name: " + firstName + " " + lastName);
    }

    public void getFirstName() { // method to print the employee's first name
        System.out.println("First name: " + firstName);
    }

    public void getLastName() { // method to print the employee's last name
        System.out.println("Last name: " + lastName);
    }
    
    public void getSalary() { // method to print the salary formatted to two decimal places
        System.out.printf("Salary: %.2f \n", salary);
    }

    public void setSalary(double salary) {  // method that sets the salary 
        this.salary = salary;
    }

    public void getAnnualSalary() { // method that displays the computed annual salary
        double annual = percent * 12;
        System.out.printf("Annual salary: %.2f \n", annual);
       

    }

    public void raiseSalary(double percent) { // method that computes the salary increase
       this.percent = (salary + (salary * percent));

    }

}
