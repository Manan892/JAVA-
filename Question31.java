package Lab_6;

class Parent {
    int x;

    // Superclass constructor
    Parent(int x) {
        this.x = x;   // this refers to current class variable
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent {
    int x;

    // Subclass constructor
    Child(int parentValue, int childValue) {
        super(parentValue);   // (b) Call superclass constructor
        this.x = childValue;  // this refers to child class variable
        System.out.println("Child Constructor Called");
    }

    void display() {
        System.out.println("Child x: " + this.x);     // Child variable
        System.out.println("Parent x: " + super.x);   // (a) Superclass variable
    }
}

public class Question31 {
    public static void main(String[] args) {
        Child obj = new Child(10, 20);
        obj.display();
    }
}