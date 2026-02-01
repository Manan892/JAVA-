import java.util.Scanner;

class RecieveString {
    private String str;
    
    public void setStr (String str) {
        this.str = str;
    }
    public String getStr () {
        return str;
    }
}

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RecieveString rs = new RecieveString();
        System.out.print("Enter your string: ");
        rs.setStr(sc.nextLine());
    
        System.out.print("Enter the number from where you want me to print string: ");
        int n = sc.nextInt();

        String str = rs.getStr();
        while (n>=0 && n<str.length()) {
            char c=str.charAt(n);
            System.out.print(c);
            n++;
        }
        sc.close();
    }
}
