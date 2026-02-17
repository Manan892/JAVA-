package Lab_6;

//Abstract class Car
abstract class Car {
 String brand; // instance variable

 // Constructor
 Car(String brand) {
     this.brand = brand;
 }

 // Concrete method
 void displayBrand() {
     System.out.println("Brand: " + brand);
 }

 // Abstract methods
 abstract void avg();
 abstract void mode();
}

//Subclass Maruti
class Maruti extends Car {
 Maruti(String brand) {
     super(brand);
 }

 @Override
 void avg() {
     System.out.println("Maruti average mileage: 20 km/l");
 }

 @Override
 void mode() {
     System.out.println("Maruti mode: Economy mode");
 }
}

//Subclass Santro
class Santro extends Car {
 Santro(String brand) {
     super(brand);
 }

 @Override
 void avg() {
     System.out.println("Santro average mileage: 18 km/l");
 }

 @Override
 void mode() {
     System.out.println("Santro mode: Comfort mode");
 }
}

//Class Car1 to demonstrate features
class Car1 {
 void showCarFeatures(Car car) {
     car.displayBrand();
     car.avg();
     car.mode();
 }
}

//Public class with main method
public class Question34 {
 public static void main(String[] args) {
     Car1 carDemo = new Car1();

     // Using reference of abstract class pointing to Maruti object
     Car marutiCar = new Maruti("Maruti Suzuki");
     carDemo.showCarFeatures(marutiCar);

     System.out.println();

     // Using reference of abstract class pointing to Santro object
     Car santroCar = new Santro("Hyundai Santro");
     carDemo.showCarFeatures(santroCar);
 }
}
