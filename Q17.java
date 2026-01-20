package FigPackage;
import java.util.Scanner;

abstract class Figure {
    private double pi = 3.1420;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();
    public double getPI() {
        return pi;
    }
}
class Cone extends Figure{
    private double r;
    private double h;
    private double a;
    private double v;
    public void calcArea() {
        a = getPI()*r*Math.sqrt(r*r+h*h);
    }
    public void calcVol() {
        v = getPI()*r*r*h/3;
    }
    public void DispArea(){
        System.out.println("The area of cone with given dimension is " + a);
    }
    public void Dispvol(){
        System.out.println("The volume of cone with given dimension is " + v);
    }
    public void setR(double r) {
        this.r = r;
    }
    public void setH(double h) {
        this.h = h;
    }
}
class Sphere extends Figure {
    private double r;
    private double a;
    private double v;
    public void calcArea(){
        a = 4*getPI()*r*r;
    }
    public void calcVol(){
        v = 4*getPI()*r*r*r/3;
    }
    public void DispArea(){
        System.out.println("The area of sphere with given dimension is " + a);
    }
    public void Dispvol(){
        System.out.println("The volume of sphere with given dimension is " + v);
    }
    public void setR(double r) {
        this.r=r;
    }
}
class Cylinder extends Figure {
    private double r;
    private double h;
    private double a;
    private double v;
    public void calcArea(){
        a = 2*getPI()*r*h;
    }
    public void calcVol(){
        v = getPI()*r*r*h;
    }
    public void DispArea(){
        System.out.println("The area of cylinder with given dimension is " + a);
    }
    public void Dispvol(){
        System.out.println("The volume of cylinder with given dimension is " + v);
    }
    public void setR(double r) {
        this.r=r;
    }
    public void setH(double h) {
        this.h=h;
    }
}
public class Q17 {
    public static double rightValue(double a,int l,int r,Scanner sc) {
        while (a<l || a>r) {
            System.out.print("Enter correct value: ");
            a=sc.nextDouble();
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q=1;

        while(q!=0) {

            System.out.println("Press 1 for cone:");
            System.out.println("Press 2 for sphere:");
            System.out.println("Press 3 for cylinder:");
            int n=(int)rightValue(sc.nextDouble(), 1, 3, sc);

            switch (n) {
                case 1:
                    Cone a = new Cone();
                    System.out.print("Enter the radius: ");
                    double r1=rightValue(sc.nextDouble(), 0, 10000, sc);
                    a.setR(r1);
                    System.out.print("Enter the height: ");
                    double h1=rightValue(sc.nextDouble(), 0, 10000, sc);
                    a.setH(h1);

                    a.calcArea();
                    a.DispArea();
                    a.calcVol();
                    a.Dispvol();
                    break;                   
                case 2:
                    Sphere b = new Sphere();
                    System.out.print("Enter the radius: "); 
                    double r2=rightValue(sc.nextDouble(), 0, 10000, sc);
                    b.setR(r2);

                    b.calcArea();
                    b.DispArea();
                    b.calcVol();
                    b.Dispvol();
                    break;
                case 3:
                    Cylinder c = new Cylinder();
                    System.out.print("Enter the radius: ");
                    double r3=rightValue(sc.nextDouble(), 0, 10000, sc);
                    c.setR(r3);
                    System.out.print("Enter the height: ");
                    double h2=rightValue(sc.nextDouble(), 0, 10000, sc);
                    c.setH(h2);

                    c.calcArea();
                    c.DispArea();
                    c.calcVol();
                    c.Dispvol();
                    break;
            }

            System.out.print("Press 0 to quit: ");
            q=sc.nextInt();
        }

        sc.close();
    }
}
