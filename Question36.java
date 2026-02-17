package Lab_6;
import java.util.Scanner;

import java.util.Scanner;

class Point3D {
    int x;
    int y;
    int z;

    // Constructor for origin (0,0,0)
    Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    // Constructor for arbitrary point
    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to input coordinates
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();
        System.out.print("Enter z coordinate: ");
        z = sc.nextInt();
    }

    // Method to display coordinates
    void display() {
        System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
    }

    // Method to calculate distance between two points
    double distance(Point3D p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        int dz = this.z - p.z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class Question36 {
    public static void main(String[] args) {

        // Create first point (origin)
        Point3D p1 = new Point3D();

        // Create second point (user input)
        Point3D p2 = new Point3D();
        System.out.println("Enter coordinates for second point:");
        p2.input();

        // Display both points
        System.out.println("\nFirst Point (Origin):");
        p1.display();

        System.out.println("Second Point:");
        p2.display();

        // Calculate and display distance
        double dist = p1.distance(p2);
        System.out.println("\nDistance between two points: " + dist);
    }
}
