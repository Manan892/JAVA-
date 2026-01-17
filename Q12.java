import java.util.Scanner;
class CreditCalculator {
    private int accountNumber;
    private int initialBalance;
    private int charges;
    private int credits;
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber=accountNumber;
    }
    public void setInitialBalance(int initialBalance) {
        this.initialBalance=initialBalance;
    }
    public void setCharges(int charges) {
        this.charges=charges;
    }
    public void setCredits(int credits) {
        this.credits=credits;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public int getInitialBalance() {
        return initialBalance;
    }
    public int getnewBalance() {
        return initialBalance+charges-credits;
    }

}
class Q12 {

    public static int rightValue(int a,int l,Scanner sc) {
        while(a<l) {
            System.out.print("Enter correct value: ");
            a = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        CreditCalculator cc=new CreditCalculator();

        System.out.print("Enter The Account-Number: ");
        cc.setAccountNumber(sc.nextInt());
    
        System.out.print("Enter intial balance: ");
        int ib=rightValue(sc.nextInt(),0,sc);
        cc.setInitialBalance(ib);

        System.out.print("Enter your charges: ");
        int ch=rightValue(sc.nextInt(),0,sc);
        cc.setCharges(ch);

        System.out.print("Enter your credits: ");
        int cr=rightValue(sc.nextInt(),0,sc);
        cc.setCredits(cr);

        System.out.print("Enter your monthly limit: ");
        int limit=rightValue(sc.nextInt(), cc.getInitialBalance(), sc);

        if(limit>cc.getnewBalance()) 
            System.out.println("The account " + cc.getAccountNumber() + " has not exided it's max limit.");
        else if(limit==cc.getnewBalance())
            System.out.println("The account " + cc.getAccountNumber() + " has not exided it's max limit but it's at limit so don't spend anymore.");
        else
            System.out.println("The account " + cc.getAccountNumber() + " has exided it's max limit.");

        sc.close();
    }    
}
