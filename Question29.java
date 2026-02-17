package Lab_5;
import java.util.Scanner;
enum Answer {
	CORRECT , WRONG , UNANSWERED
}
public class Question29 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		char[] key = {'C' , 'A' , 'B' , 'D' , 'B' , 'C' , 'C' , 'A'};
		char[] written = new char[8];
		for(int i=0;i<8;i++) {
			System.out.print("Enter answer-" + (i+1) + ": ");
			written[i] = sc.next().charAt(0);
			written[i] = Character.toUpperCase(written[i]);
		}
		Answer[] ans = Answer.values();
		System.out.println();
		System.out.println();
		System.out.println("Question  Submitted  Original  Result");
		for(int i=0;i<8;i++) {
			System.out.print("   " + i + "          " + written[i] + "         " + key[i] + "      ");
			if(written[i]=='A' || written[i]=='B' || written[i]=='C' || written[i]=='D') {
				if(written[i]==key[i])
					System.out.print(ans[0]);
				else 
					System.out.print(ans[1]);
			}
			else 
				System.out.print(ans[2]);
			System.out.println();
		}
		sc.close();
	}
}
