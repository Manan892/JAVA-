package Lab_5;
import java.util.Scanner;
import java.util.Arrays;

interface Queueimpl {
	void insert(int a[],int ...var);
	void delete();
	void display(int a[]);
}

class QueueState {
	int top = -1;
	int rear = -1;
	int size = 0;
}

class QueueDemo {
	void insert(int a[],QueueState qs,int ticket) {
		try {
			if(qs.top==-1) {
				qs.top++;
				qs.rear++;
				qs.size++;
				a[qs.top]=ticket;
			}
			else if(qs.rear<9) {
				qs.rear++;
				qs.size++;
				a[qs.rear]=ticket;
			}
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("OverFlow");
		}
	}
	void delete(int a[],QueueState qs) {
		try {
			if(qs.size==1) {
				a[0] = 0;
			}
			else {
				for(int i=1;i<qs.size;i++) {
					a[i-1]=a[i];
				}
				a[qs.size-1]=0;
			}
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("UnderFlow");
		}
	}
	void display(int a[]) {
		System.out.println(Arrays.toString(a));
	}
	
}

public class Question24 {
	public static int ticketValue(int a,Scanner sc) {
		while(a<1) {
			System.out.print("Enter a valid value: ");
			a = sc.nextInt();
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueDemo qd = new QueueDemo();
		QueueState qs = new QueueState();
		int[] a = new int[10];
		int n=1;
		while(n!=-1) {
			System.out.print("Press 1 to insert:\nPress 2 to delete:\nPress 3 to display:\n");
			switch(sc.nextInt()) {
				case 1:
					System.out.print("Enter how many tickets you want: ");
					int ticket= ticketValue(sc.nextInt(),sc);
					qd.insert(a,qs,ticket);
					break;
				case 2:
					qd.delete(a, qs);
					System.out.println("The delete opration in performed");
					break;
				case 3:
					System.out.println("Queue:");
					qd.display(a);
					break;
				default :
					System.out.println("Non justifying operation\n");
			}
			System.out.print("Press -1 to exit: ");
			n = sc.nextInt();
		}
		sc.close();
	}
}