import java.util.Scanner;

class Figure {
    private double r;
    private double a;
    private double v;
    public void dispArea() {
        System.out.print("\nThe area of the cone with given parameters is " + a);
    }
    public void dispVolume() {
        System.out.print("\nThe volume of the cone with given parameters is " + v);
    }
    public void setR(double r) {
        this.r=r;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setV(double v) {
        this.v = v;
    }
    public double getR() {
        return r;
    }
}
class Cone extends Figure {
    private double h;
    private double s;
    public double calcArea() {
        return Math.PI*getR()*s;
    }    
    public double calcVolume() {
        return (Math.PI*getR()*getR()*h)/3;
    }
    public void setH(double h) {
        this.h=h;
    }
    public void setS(double s) {
        this.s=s;
    }
}
public class Q14InheritanceDemo {
    public static double rightValue(double a,int l,Scanner sc) {
        while (a<l) {
            System.out.print("Enter correct value: ");
            a=sc.nextDouble();
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cone c= new Cone();
        System.out.print("Enter the radius: ");
        double r=rightValue(sc.nextDouble(),0,sc);
        c.setR(r);

        System.out.print("Enter the height: ");
        double h=rightValue(sc.nextDouble(), 0, sc);
        c.setH(h);

        System.out.print("The slant height is: " + Math.sqrt(r*r+h*h));
        c.setS(Math.sqrt(r*r+h*h));

        c.setA(Math.PI*r*Math.sqrt(r*r+h*h));
        c.setV(Math.PI*r*r*Math.sqrt(r*r+h*h)/3);
        
        c.dispArea();
        c.dispVolume();
        sc.close();
    }
    
}
