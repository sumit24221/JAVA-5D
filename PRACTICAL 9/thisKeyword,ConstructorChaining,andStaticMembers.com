
class Employee {

    // Instance variables
    String name;
    double salary;

    // Static variable
    static int count = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0.0);
    }

    // Parameterized constructor
    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;

        count++;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("----------------------");
    }

    // Static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating first object using no-argument constructor
        Employee e1 = new Employee();

        // Creating second object using parameterized constructor
        Employee e2 = new Employee("Rahul", 30000);

        // Creating third object using parameterized constructor
        Employee e3 = new Employee("Priya", 40000);

        // Displaying employee details
        System.out.println("Employee 1 Details:");
        e1.display();

        System.out.println("Employee 2 Details:");
        e2.display();

        System.out.println("Employee 3 Details:");
        e3.display();

        // Calling static method
        Employee.displayCount();
    }
}
