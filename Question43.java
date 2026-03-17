package Lab_7;
import java.util.Scanner;

enum Answer {
	CORRECT , WRONG , UNANSWERED
}

public class Question43 {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] key = {'C' , 'A' , 'B' , 'D'};
		char[] written = new char[4];
		
		for(int i=0;i<4;i++) {  // Getting answer input and storing it in upper case character
			System.out.print("Enter answer-" + (i+1) + ": ");
			written[i] = sc.next().charAt(0);
			written[i] = Character.toUpperCase(written[i]);
		}
		
		Answer[] ans = Answer.values(); // Making enum able to be called via index
		
		int count = 0;
		
		System.out.println("\n\nQuestion  Submitted  Original  Result");
		for(int i=0;i<4;i++) {
			System.out.print("   " + i + "          " + written[i] + "         " + key[i] + "      ");
			if(written[i]=='A' || written[i]=='B' || written[i]=='C' || written[i]=='D') {
				if(written[i]==key[i]) {
					System.out.print(ans[0]);
					count++;
				}	
				else 
					System.out.print(ans[1]);
			}
			else 
				System.out.print(ans[2]);
			System.out.println();
		}
		if(count>=2) 
			System.out.println("Candidate passed");
		sc.close();
	}
}
