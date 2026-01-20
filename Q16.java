import java.util.Scanner;

class X {
    int i;
    int j;

    X(int i,int j) {
        this.i=i;
        this.j=j;
    }
    public int finalSum() {
        return i+j;
    }
}
class Y extends X {
    Y(int i, int j) {
        super(i, j);
    }
    public int finalsub() {
        return i-j;
    }
}
class Z extends Y {

    Z(int i, int j) {
        super(i, j);
    }
    public int finalmulti() {
        return i*j;
    }
    
}

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Z inhert = new Z(sc.nextInt(),sc.nextInt());
        System.out.println("The sum is " + inhert.finalSum());
        System.out.println("The difference is " + inhert.finalsub());
        System.out.println("The product is " + inhert.finalmulti());
        sc.close();
    }
}
