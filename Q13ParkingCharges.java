import java.util.Scanner;
class Q13ParkingCharges {
    public static double calculateCharges(int hours) {
        double charge = 2.0; 
        
        if (hours > 3) {
            charge += 0.5 * (hours - 3);
        }
        
        // Apply maximum cap
        if (charge > 10.0) {
            charge = 10.0;
        }
        
        return charge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.print("Enter number of customers: ");
        int customers = input.nextInt();

        for (int i = 1; i <= customers; i++) {
            System.out.print("Enter hours parked for customer " + i + ": ");
            int hours = input.nextInt();

            double charge = calculateCharges(hours);
            System.out.printf("Customer %d charge: $%.2f%n", i, charge);

            totalReceipts += charge;
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        input.close();
    }
}
