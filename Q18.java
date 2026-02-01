import java.util.Arrays;
import java.util.Scanner;

class Matrix3D {
    private int a;
    private int b;
    private int c;
    int[][][] matrix;       //declaring a 3d matrix

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void createMatrix() {            //initiallizing matrix because it'll be 0,0,0 by default
        matrix = new int[a][b][c];
    }
}

class Array {
    private int n;
    private int[] arr;      //creating array

    public void setN(int n) {
        this.n = n;
    }

    public void createArray() {
        arr = new int[n];
    }

    public void setArrkth(int k, int value) {       //definig the size of the arr
        arr[k] = value;
    }

    public int[] getArr() {     
        return arr;
    }
}

public class Q18 {

    static int rightvalue(int a, Scanner sc) {
        while (a < 1) {
            System.out.print("Enter correct value: ");
            a = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matrix3D mat = new Matrix3D();
        System.out.println("Enter x,y,z for matrix[x][y][z]: ");
        System.out.print("Enter x: ");
        int a = rightvalue(sc.nextInt(), sc);
        mat.setA(a);

        System.out.print("Enter y: ");
        int b = rightvalue(sc.nextInt(), sc);
        mat.setB(b);

        System.out.print("Enter z: ");
        int c = rightvalue(sc.nextInt(), sc);
        mat.setC(c);

        mat.createMatrix();                 //making function call and start heap location for the matrix

        for (int i = 0; i < a; i++) {           //Stroing data into matrix
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print("Enter element [" + (i+1) + "][" + (j+1) + "][" + (k+1) + "]: ");
                    mat.matrix[i][j][k] = sc.nextInt();
                }
            }
        }

        Array arr = new Array();
        arr.setN(a * b * c);                //the number of elements in matrix with dimension is a*b*c
        arr.createArray();

        for (int i = 0; i < a; i++) {           //setting the value of array in matrix
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    arr.setArrkth(i * (b * c) + j * c + k, mat.matrix[i][j][k]);           
                }
            }
        }

        System.out.println(Arrays.toString(arr.getArr()));  
        sc.close();
    }
}
