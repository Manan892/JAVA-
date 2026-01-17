import java.util.Scanner;

class Invoice {
    private String partName;
    private String partDiscription;
    private int quantity;
    private double price;
    public double Total() {
        return quantity*price;
    }

    public void setPartName(String partName) {
        this.partName=partName;
    }
    
    public void setPartDiscription(String partDiscription) {
        this.partDiscription=partDiscription;
    }
        
    public void setQuantity(int quantity) {
        if (quantity < 0) 
            quantity = 0;
        this.quantity=quantity;
    }

    public void setPrice(double price) {
        if (price < 0) 
            price = 0.0;
        this.price=price;
    }
    
    public String getPartName() {
        return partName;
    }
    
    public String getPartDiscription() {
        return partDiscription;
    }
        
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
       return price;
    }

}


class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the part name: ");
        String i = sc.nextLine();
        
        System.out.print("Enter the part dicription: ");
        String j = sc.nextLine();
    
        System.out.print("Enter the quantity: ");
        int k = sc.nextInt();
        
        System.out.print("Enter the part price: ");
        double l = sc.nextDouble();

        Invoice a = new Invoice();
        a.setPartName(i);
        a.setPartDiscription(j);
        a.setQuantity(k);
        a.setPrice(l);
        
        double total=a.Total();
        System.out.print("\n\nInvioce\n\n");
        System.out.println("Product: " + a.getPartName());
        System.out.println("Discription: " + a.getPartDiscription());
        System.out.println("Quantity: " + a.getQuantity());
        System.out.println("Price: " + a.getPrice());
        System.out.println("Total: " + total);
        sc.close();
    }
}
