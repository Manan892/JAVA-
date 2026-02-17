package Lab_5;
import java.util.Scanner;

class Fruit {
    String name;
    int quantity;
    double price;

    void display() {
        System.out.println();
        System.out.println("Details:- ");
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fruit f1 = new Fruit();
        System.out.println("Enter Name: ");
        f1.name = sc.nextLine();
        System.out.println("Enter Quantity: ");
        f1.quantity = sc.nextInt();
        System.out.println("Enter Price: ");
        f1.price = sc.nextDouble();
        sc.nextLine(); // clear buffer
        f1.display();

        Fruit f2 = new Fruit();
        System.out.println("Enter Name: ");
        f2.name = sc.nextLine();
        System.out.println("Enter Quantity: ");
        f2.quantity = sc.nextInt();
        System.out.println("Enter Price: ");
        f2.price = sc.nextDouble();
        sc.nextLine(); // clear buffer
        f2.display();

        sc.close();
    }
}