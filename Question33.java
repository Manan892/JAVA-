package Lab_6;
import java.util.Scanner;

class WashingMachine {
    
    // Method to switch on the machine
    void switchOn() {
        System.out.println("Washing Machine is now ON.");
    }
    
    // Method to accept clothes
    int acceptClothes(int noOfClothes) {
        System.out.println(noOfClothes + " clothes accepted.");
        return noOfClothes;
    }
    
    // Method to accept detergent
    void acceptDetergent() {
        System.out.println("Detergent accepted.");
    }
    
    // Method to switch off the machine
    void switchOff() {
        System.out.println("Washing Machine is now OFF.");
    }
    
}


public class Question33 {
	public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        Scanner sc = new Scanner(System.in);
        wm.switchOn();
        System.out.print("Enter no. of clothes: ");
        int clothes = wm.acceptClothes(sc.nextInt()); 
        wm.acceptDetergent();        
        System.out.println("Returned clothes count: " + clothes);
        wm.switchOff();
        sc.close();
    }
}
