package Lab_5;
import java.util.Scanner;

public class Question25 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the HexaDecimal Number: ");
		String s = sc.nextLine();
		if(!s.matches(".*[0-9A-Fa-f].*")) {
			System.out.println("The string is not hexadecimal number");
		}
		else {
			System.out.println("The stiring is a hexadecimal number");
		}
		System.out.print("The string is " + s);
		sc.close();
	}
}

