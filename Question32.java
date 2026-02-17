package Lab_6;
import java.util.Scanner;

class Theatre {
	private final double fixCost = 0.5;
	private final double ticket = 5;
	private final double performanceCost = 20;
	private int atendee;
	public int getAtendee() {
		return atendee;
	}
	public void setAtendee(int atendee) {
		this.atendee = atendee;
	}

	void income() {
		double k = (ticket-fixCost)*atendee-performanceCost; 
		if(k>0) 
			System.out.print("The Theatre makes profit of " + k + " when " + atendee + " person attends the show");
		else if(k==0) 
			System.out.print("The Theatre makes no profit no loss when " + atendee + " person attends the show");
		else 
			System.out.print("The Theatre makes loss of " + Math.abs(k) + " when " + atendee + " person attends the show");
	}
}

public class Question32 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Theatre t = new Theatre();
		System.out.print("Enter how many person attended show: ");
		t.setAtendee(sc.nextInt());
		t.income();
		sc.close();
	}
}
