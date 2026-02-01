import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int a = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int b = sc.nextInt();
        System.out.print("Enter the pattern: ");
        int p = sc.nextInt();
        String pattern = String.valueOf(p);
        int n=0;
        while(b==a) {
            System.out.print("Enter a different number: ");
            b = sc.nextInt();
        }
        if(a>b)
            b=(a+b)-(a=b);
        for(;a<=b;a++) {
            String str = String.valueOf(a);
            if(str.contains(pattern)) 
                n++;
        }

        System.out.println("The pattern " + pattern + " occured " + n + " times.");
        sc.close();
    }    
}
