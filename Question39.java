package Lab_7;
import java.util.Scanner;

class Book {
    String bookID;
    String title;
    String author;
    double price;
    int repeatRate;

    Book(String bookID, String title, String author,
         double price, int repeatRate) {

        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        this.repeatRate = repeatRate;
    }

    void changeDetails(Scanner sc) {
        System.out.print("Enter modified price: ");
        price = sc.nextDouble();

        System.out.print("Enter modified time for new edition (days): ");
        repeatRate = sc.nextInt();
    }

    void display() {
        System.out.println("\nBook ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("New edition in " + repeatRate + " days");
        System.out.println("Price: " + price);
    }
}

public class Question39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter New Edition Time (days): ");
        int repeat = sc.nextInt();

        Book hm = new Book(id, title, author, price, repeat);

        hm.display();

        System.out.print("\nDo you want to change price and edition time (true/false)? ");
        boolean check = sc.nextBoolean();

        if(check) {
            hm.changeDetails(sc);
            System.out.println("Updated Details:");
            hm.display();
        }

        sc.close();
    }
}