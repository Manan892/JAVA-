package Lab_7;
import java.util.Scanner;

//Base class: Teacher
class Teacher {
	String name;
	int age;
	String subject;

 void displayTeacherInfo() {
     System.out.println("Teacher Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Subject: " + subject);
 }
}

//Derived class: Student (inherits Teacher)
class Student extends Teacher {
	int rollNumber;
	String grade;

	void displayStudentInfo() {
		// Reuse Teacher class members
		displayTeacherInfo();
		// Add Student-specific members
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Grade: " + grade);
 		}
}

//Main class to test
public class Question40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.print("Enter the name: ");
		s.name = sc.nextLine();
		System.out.print("Enter your subjet: ");
		s.subject = sc.nextLine();
		System.out.print("Enter your age: ");
		s.age = sc.nextInt();
		boolean n;
		System.out.print("Is entered person a student ");
		n = sc.nextBoolean();
		if(n) {
			System.out.print("Enter your roll.no ");
			s.rollNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter your grade: ");
			s.grade = sc.nextLine();
			System.out.println("\n\n--Details---");
			s.displayStudentInfo();
		}
		else {
			System.out.println("\n\n--Details---"); 
			s.displayTeacherInfo();
		}
		sc.close();
	}
}
