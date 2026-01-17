import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getYearlySalary() {
        return 12 * salary;
    }
}

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee a = readEmployee(sc, "Employee-1");
        Employee b = readEmployee(sc, "Employee-2");

        System.out.println("\nEmployee test :-\n");

        printEmployee("Employee-1", a);
        printEmployee("Employee-2", b);

        sc.close();
    }
    
    private static Employee readEmployee(Scanner sc, String label) {
        Employee emp = new Employee();
        System.out.println("\nEnter details for " + label);

        System.out.print("First name: ");
        emp.setFirstName(sc.nextLine());

        System.out.print("Last name: ");
        emp.setLastName(sc.nextLine());

        System.out.print("Monthly salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        if (salary >= 0) {
            emp.setSalary(salary);
        }

        return emp;
    }

    // Helper method to print employee details
    private static void printEmployee(String label, Employee emp) {
        System.out.println(label);
        System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Yearly Salary: " + emp.getYearlySalary());
    }
}