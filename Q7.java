import java.util.Scanner;

class CostManagement {
    float totalMiles;
    float costGasoline=378.5f;
    int extaFees;
    int toll;
    int milesPerGallon=25;
    CostManagement(int t,int e,float d) {
        toll = t;
        extaFees = e;
        totalMiles = d;
    }
    double totalMoney() {
        return toll+extaFees+totalMiles*costGasoline/25;
    }
}

class Q7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter your daily toll: ");
        int t = sc.nextInt();
        System.out.print("Enter your extra charges: ");
        int e = sc.nextInt();
        System.out.print("Enter your daily distance travelled(MILES): ");
        float d = sc.nextFloat();
        
        CostManagement day = new CostManagement(t,e,d);

        System.out.print("Enter number of person: ");
        int n = sc.nextInt();

        while(n>7 && n<1) {
            System.out.println("Enter valid pooling: ");
            n = sc.nextInt();
        }
        double total=day.totalMoney();
        
        System.out.println("The savings you would have is " + (total*(n-1)/n));
        sc.close();
    }
}
