package Encapsulation_Polymorphism;
import java.util.*;

abstract class RentalVehicle {
    private String vehicleNumber,type; private double rentalRate;
    RentalVehicle(String v,String t,double r){vehicleNumber=v;type=t;rentalRate=r;}
    public String getVehicleNumber(){return vehicleNumber;}
    public String getType(){return type;}
    public double getRentalRate(){return rentalRate;}
    abstract double calculateRentalCost(int d);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class RentalCar extends RentalVehicle implements Insurable {
    private String policyNo;
    RentalCar(String v,double r,String p){super(v,"Car",r);policyNo=p;}
    public double calculateRentalCost(int d){return getRentalRate()*d;}
    public double calculateInsurance(){return getRentalRate()*0.1;}
    public String getInsuranceDetails(){return "Car Policy:"+policyNo;}
}

class RentalBike extends RentalVehicle implements Insurable {
    private String policyNo;
    RentalBike(String v,double r,String p){super(v,"Bike",r);policyNo=p;}
    public double calculateRentalCost(int d){return getRentalRate()*d*0.8;}
    public double calculateInsurance(){return getRentalRate()*0.05;}
    public String getInsuranceDetails(){return "Bike Policy:"+policyNo;}
}

class RentalTruck extends RentalVehicle implements Insurable {
    private String policyNo;
    RentalTruck(String v,double r,String p){super(v,"Truck",r);policyNo=p;}
    public double calculateRentalCost(int d){return getRentalRate()*d*1.5;}
    public double calculateInsurance(){return getRentalRate()*0.2;}
    public String getInsuranceDetails(){return "Truck Policy:"+policyNo;}
}

class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<RentalVehicle> list=new ArrayList<>();
        list.add(new RentalCar(sc.next(),sc.nextDouble(),sc.next()));
        list.add(new RentalBike(sc.next(),sc.nextDouble(),sc.next()));
        list.add(new RentalTruck(sc.next(),sc.nextDouble(),sc.next()));
        int days=sc.nextInt();
        for(RentalVehicle v:list){
            Insurable i=(Insurable)v;
            System.out.println(v.getType()+" "+v.getVehicleNumber()+" Cost:"+v.calculateRentalCost(days)+" Insurance:"+i.calculateInsurance()+" "+i.getInsuranceDetails());
        }
    }
}