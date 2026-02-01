import java.util.Scanner;

interface Function {
    int evaluate(int x);    //function prototype
}

class Half implements Function {
    public int evaluate(int x) {    //functoin defination
        return x / 2;
    }
}

public class Q23 {

    
    public static int[] processArray(int[] arr) {       // Method to process array using Function
        Function f = new Half();                        // create instance of Half
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = f.evaluate(arr[i]);             // halve each element
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter how many elements you want in your arr: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter element["+ (i+1) + "]: ");
            numbers[i] = sc.nextInt();
        }

        int[] halved = processArray(numbers);

        System.out.println("Original array:");
        for (int k : numbers) {
            System.out.print(k + " ");
        }

        System.out.println("\nHalved array:");
        for (int h : halved) {
            System.out.print(h + " ");
        }
        sc.close();
    }
}