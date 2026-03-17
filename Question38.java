package Lab_7;
import java.util.Scanner;

class Vehicle { 
	
	public Vehicle vehicleSelection(Scanner sc) { // A method which returns object of the selected vehicle if selected
		Boolean lic;
		System.out.print("Do you have licaence(true-yes/false-no):");
		lic = sc.nextBoolean();
		if(lic) {
			System.out.println("Press 1 for car:\nPress 2 for scooter");
			switch(sc.nextInt()) {
				case 1: return new Car();
				case 2: return new Scooter();
				default: return new Vehicle(); // As long as Driver doesn't choose a vehicle he will kept being ask			
			}
		}
		return new Cycle(); // If driver don't have license then he must be using a cycle
	}
	
	// Creating private class cause I want user to go through vehicle class at all cost
	
	private class Cycle extends Vehicle {
		double maxSpeed() {
			return 20;
		}
	}
	private class Scooter extends Vehicle {
		double maxSpeed() {
			return 75;
		}
	}
	private class Car extends Vehicle {
		double maxSpeed() {
			return 153;
		}
	}
	double maxSpeed() { // A method to check if a vehicle is entered or not and also to display max speed via override
		return 0;
	}
}

public class Question38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle v = new Vehicle();
		v = v.vehicleSelection(sc); 
		
		while(v.maxSpeed()==0)	// If the condition is true the user must have entered the default case of switch cause only Vehicle.maxSpeed has zero max speed
			v=v.vehicleSelection(sc);
		
		Class<?> cls = v.getClass(); // A way to get the class of following vehicle and store it in cls
		System.out.println("The driver drives vehicle "+cls.getSimpleName()+"\n"+cls.getSimpleName()+" has maximum speed of " + v.maxSpeed());
		
		// here due to use of package we use getSimpleNmae if there is no package then getName also returns class name
		
		sc.close();
	}
}
