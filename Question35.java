package Lab_6;
import java.util.Scanner;

class Bank {
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double withdraw(double amount) { 
		return (balance - amount >= 0) ? (balance - amount) : 0;
	}
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
}

public class Question35 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		System.out.print("Enter initial balance: ");
		b.setBalance(sc.nextDouble());
		System.out.println("Press 1 for Deposit:\nPress 2 for Withdraw");
		switch(sc.nextInt()) {
			case 1:
				System.out.print("Enter the amount you want to deposit: ");
				System.out.print("The new balance is " + b.deposit(sc.nextDouble()));;
				break;
			case 2:
				System.out.print("Enter the amount you want to withdraw: ");
				System.out.print("The new balance is " + b.withdraw(sc.nextDouble()));
				break;
		}
		sc.close();
	}
}
