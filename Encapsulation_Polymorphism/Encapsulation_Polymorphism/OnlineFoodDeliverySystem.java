package Encapsulation_Polymorphism;
import java.util.*;

interface Discountable{
    double applyDiscount(double amt);
    String getDiscountDetails();
}
abstract class FoodItem{
    private String itemName; private double price; private int quantity;
    public FoodItem(String n,double p,int q){itemName=n;price=p;quantity=q;}
    public String getItemName(){return itemName;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}
    public abstract double calculateTotalPrice();
    public void getItemDetails(){System.out.println("Item:"+itemName+" | Qty:"+quantity+" | Price:"+price+" | Total:"+calculateTotalPrice());}
}

class VegItem extends FoodItem implements Discountable{
    public VegItem(String n,double p,int q){super(n,p,q);}
    public double calculateTotalPrice(){return getPrice()*getQuantity();}
    public double applyDiscount(double amt){return amt*0.9;}
    public String getDiscountDetails(){return "10% off on Veg Items";}
}

class NonVegItem extends FoodItem implements Discountable{
    public NonVegItem(String n,double p,int q){super(n,p,q);}
    public double calculateTotalPrice(){return (getPrice()*getQuantity())+50;}
    public double applyDiscount(double amt){return amt*0.85;}
    public String getDiscountDetails(){return "15% off on Non-Veg Items";}
}

public class OnlineFoodDeliverySystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<FoodItem> order=new ArrayList<>();
        System.out.print("Enter number of items: ");int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Type (1-Veg,2-NonVeg): ");int t=sc.nextInt();sc.nextLine();
            System.out.print("Item Name: ");String name=sc.nextLine();
            System.out.print("Price: ");double price=sc.nextDouble();
            System.out.print("Quantity: ");int qty=sc.nextInt();
            if(t==1)order.add(new VegItem(name,price,qty));
            else if(t==2)order.add(new NonVegItem(name,price,qty));
        }
        double total=0;
        for(FoodItem f:order){
            f.getItemDetails();
            double cost=f.calculateTotalPrice();
            if(f instanceof Discountable)cost=((Discountable)f).applyDiscount(cost);
            total+=cost;
        }
        System.out.println("Final Payable Amount: "+total);
    }
}

