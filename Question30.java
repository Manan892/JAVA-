package Lab_5;
import java.util.Scanner;

class Student {
    private String name;

    // Method to input name
    public String inputName(String name) {
        this.name = name;
        return this.name;
    }

    // Method to calculate average and return pass/fail
    public String average(int mark1, int mark2, int mark3) {
        double avg = (mark1 + mark2 + mark3) / 3.0;
        if (avg > 50) {
            return name + " has Passed with an average of " + avg;
        } else {
            return name + " has Failed with an average of " + avg;
        }
    }
}

public class Question30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        // Input name
        System.out.print("Student Name: ");
        s1.inputName(sc.nextLine());
        // Check average marks
        System.out.println("Enter marks of 3 subjects:");
        System.out.println(s1.average(sc.nextInt(), sc.nextInt(), sc.nextInt()));  
        sc.close();
    }

}
