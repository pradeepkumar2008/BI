package Encapsulation_Polymorphism;
import java.util.*;

interface GPS{
    String getCurrentLocation();
    void updateLocation(String loc);
}

abstract class Vehicle{
    private String vehicleId,driverName,location; private double ratePerKm;
    public Vehicle(String v,String d,double r){vehicleId=v;driverName=d;ratePerKm=r;location="Unknown";}
    public String getVehicleId(){return vehicleId;}
    public String getDriverName(){return driverName;}
    public double getRatePerKm(){return ratePerKm;}
    public void setRatePerKm(double r){ratePerKm=r;}
    public void setLocation(String l){location=l;}
    public String getLocation(){return location;}
    public abstract double calculateFare(double dist);
    public void getVehicleDetails(){System.out.println("ID:"+vehicleId+" | Driver:"+driverName+" | Rate:"+ratePerKm+" | Location:"+location);}
}

class Car extends Vehicle implements GPS{
    public Car(String v,String d,double r){super(v,d,r);}
    public double calculateFare(double dist){return getRatePerKm()*dist+50;}
    public String getCurrentLocation(){return getLocation();}
    public void updateLocation(String loc){setLocation(loc);}
}

class Bike extends Vehicle implements GPS{
    public Bike(String v,String d,double r){super(v,d,r);}
    public double calculateFare(double dist){return getRatePerKm()*dist;}
    public String getCurrentLocation(){return getLocation();}
    public void updateLocation(String loc){setLocation(loc);}
}

class Auto extends Vehicle implements GPS{
    public Auto(String v,String d,double r){super(v,d,r);}
    public double calculateFare(double dist){return getRatePerKm()*dist+20;}
    public String getCurrentLocation(){return getLocation();}
    public void updateLocation(String loc){setLocation(loc);}
}

public class RideHailingApplication{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Vehicle> rides=new ArrayList<>();
        System.out.print("Enter number of vehicles: ");int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Type (1-Car,2-Bike,3-Auto): ");int t=sc.nextInt();sc.nextLine();
            System.out.print("Vehicle ID: ");String id=sc.nextLine();
            System.out.print("Driver Name: ");String name=sc.nextLine();
            System.out.print("Rate per Km: ");double rate=sc.nextDouble();sc.nextLine();
            if(t==1)rides.add(new Car(id,name,rate));
            else if(t==2)rides.add(new Bike(id,name,rate));
            else if(t==3)rides.add(new Auto(id,name,rate));
        }
        System.out.print("Enter travel distance: ");double dist=sc.nextDouble();sc.nextLine();
        System.out.print("Enter location update: ");String loc=sc.nextLine();
        for(Vehicle v:rides){
            if(v instanceof GPS)((GPS)v).updateLocation(loc);
            v.getVehicleDetails();
            System.out.println("Fare for "+dist+" km: "+v.calculateFare(dist));
        }
    }
}
