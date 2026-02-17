package Lab_5;
import java.util.Scanner;

class Product {
	String productID;
	double price;
	String name;
	String categoryID;
}
class ElectricProduct extends Product {
	double voltageI;
	double voltageF;	
	double wattage;
	void change(Scanner sc) 
	{
		System.out.print("Enter new wattage: ");
		wattage = sc.nextDouble();
		System.out.print("Enter new price: ");
		price = sc.nextDouble();
	}
	void display() {
		System.out.println();
		System.out.println("product details:-");
		System.out.println();
		System.out.println("product id: " + productID);
		System.out.println("category id: " + categoryID);
		System.out.println("nmae: " + name);
		System.out.println("price: " + price);
		System.out.println("voltage range: " + voltageI + " - " + voltageF);
		System.out.println("wattage: " + wattage);
		
	}
}

public class Question26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ElectricProduct ep = new ElectricProduct();
		System.out.print("Enter product id: ");
		ep.productID = sc.nextLine();
		System.out.print("Enter category id: ");
		ep.categoryID = sc.nextLine();
		System.out.print("Enter product name: ");
		ep.name = sc.nextLine();
		System.out.print("Enter product price: ");
		ep.price = sc.nextDouble();
		System.out.print("Enter Wattage: ");
		ep.wattage = sc.nextDouble();
		System.out.print("Enter low voltage: ");
		ep.voltageI = sc.nextDouble();
		System.out.print("Enter high voltage: ");
		ep.voltageF = sc.nextDouble();
		ep.change(sc);
		ep.display();
		sc.close();
	}
}
