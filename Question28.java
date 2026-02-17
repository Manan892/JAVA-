package Lab_5;
import java.util.Scanner;

public class Question28 {
	// Method to calculate tax at a fixed rate of 15%
    public static double calculateTax(double grossPay) {
        double taxRate = 0.15; // 15% tax
        return grossPay * taxRate;
    }

    // Method to calculate net pay given hours worked and hourly rate
    public static double calculateNetPay(int hoursWorked) {
        double hourlyRate = 12.0; // $12 per hour
        double grossPay = hoursWorked * hourlyRate;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }

    // Main method to test the program
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Hours worked: ");
        int hoursWorked = sc.nextInt(); 
        double grossPay = hoursWorked * 12.0;
        double tax = calculateTax(grossPay);
        double netPay = calculateNetPay(hoursWorked);

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Tax (15%): $" + tax);
        System.out.println("Net Pay: $" + netPay);
        sc.close();
    }
}