package Lab_7;
import java.util.InputMismatchException;
import java.util.Scanner;

class Course {
	String memberID;
	String discription;
	double time;
	double fees;
	Course(String memberID,String discription,double ...var) {
		
		this.memberID = memberID;
		this.discription = discription;
		time = var[0];
		fees = var[1];
	}
	void getData() {
		System.out.println("Member ID:- " + memberID);
		System.out.println("Discription:- " + discription);
		System.out.println("Time (hours): " + time);
        System.out.println("Fees: " + fees);
	}
}

public class Question42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course[] a = new Course[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter memberID: ");
			String mid = sc.nextLine();;
			System.out.print("Enter discription: ");
			String dis = sc.nextLine();
			
			try {
				System.out.print("Enter time duration of course in hours: ");
				double t = sc.nextDouble();
				
				System.out.print("Enter fees: ");
				double f = sc.nextDouble();
				sc.nextLine(); // Removing extra line Buffer
				
				a[i] = new Course(mid,dis,t,f);
			}
			catch(InputMismatchException ex) {
				System.out.print("Mismatched input type:\nTry Agian");
				sc.nextLine(); // Removing extra line buffer
				i--; // Allowing user to retry until right values are given
			}
		}
		
		
		System.out.println("------Course Details------");
		for (Course k: a) {
			k.getData();
			System.out.println("_____________________________");
		}
		sc.close();
	}	
}

