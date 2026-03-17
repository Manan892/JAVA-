package Lab_7;
import java.util.Scanner;

class NegativeValue extends Exception {
	NegativeValue(String msg) {
		super(msg);
	}
}

class Bank {
	
	private double principal;
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	private int time;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	private final static float rate=7.38f;
	public float getRate() {
		return rate;
	}
	double totalIntrest() throws NegativeValue {
		if(principal<=0 || time<=0) {
				throw new NegativeValue("The entered value is false");
		}
		return principal*rate*time/1200;
	}
	
	double totalPrincipal() throws NegativeValue {
		return principal+totalIntrest();
	}
}

public class Question37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank sbi = new Bank();
		
		try {
			System.out.println("The intrest rate is " + sbi.getRate());
			System.out.print("Enter the amount: ");
			double amount = sc.nextDouble();
			sbi.setPrincipal(amount);
			
			System.out.print("Enter the months: ");
			int time = sc.nextInt();
			sbi.setTime(time);
			
			
			System.out.println("The total intrest is " + sbi.totalIntrest());
			System.out.print("The final principal in acount after given instructions is " + sbi.totalPrincipal());
		}
		catch(NegativeValue ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		sc. close();
	}
}
