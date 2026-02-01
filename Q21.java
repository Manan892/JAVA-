import java.util.Scanner;

class PerfectString {
    private String str;
    public void setStr(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
}

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PerfectString ps = new PerfectString();
        System.out.print("Enter the string: ");
        ps.setStr(sc.nextLine());

        String str = ps.getStr();
        String lowerStr = str.toLowerCase();
        int[] arr = new int[26];
        for(int i=0;i<26;i++) {
            arr[i]=0;
        }
        int n=lowerStr.length(),temp=25;
        for(int i=0 ; i<n; i++) {
            char c = lowerStr.charAt(i);
            int k = (int)c-97;
            arr[k]++;
            if(arr[k]==2) {
                temp = k;
                break;
            }
        }
        if(arr[temp]==2)
            System.out.println("Given string is not perfect string");
        else    
            System.out.println("Given string is perfect string");
        sc.close();
    }
}
 