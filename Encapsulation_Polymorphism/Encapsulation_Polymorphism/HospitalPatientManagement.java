package Encapsulation_Polymorphism;
import java.util.*;

interface MedicalRecord{
    void addRecord(String rec);
    void viewRecords();
}

abstract class Patient{
    private String patientId,name,diagnosis; private int age; private List<String> records=new ArrayList<>();
    public Patient(String id,String n,int a){patientId=id;name=n;age=a;}
    public String getPatientId(){return patientId;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public void setDiagnosis(String d){diagnosis=d;}
    public String getDiagnosis(){return diagnosis;}
    public void addRecord(String r){records.add(r);}
    public void viewRecords(){System.out.println("Records:"+records);}
    public abstract double calculateBill();
    public void getPatientDetails(){System.out.println("ID:"+patientId+" | Name:"+name+" | Age:"+age+" | Bill:"+calculateBill());}
}

class InPatient extends Patient implements MedicalRecord{
    private int days; private double rate;
    public InPatient(String id,String n,int a,int d,double r){super(id,n,a);days=d;rate=r;}
    public double calculateBill(){return days*rate;}
}

class OutPatient extends Patient implements MedicalRecord{
    private double fee;
    public OutPatient(String id,String n,int a,double f){super(id,n,a);fee=f;}
    public double calculateBill(){return fee;}
}

public class HospitalPatientManagement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Patient> list=new ArrayList<>();
        System.out.print("Enter number of patients: ");int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Type (1-InPatient,2-OutPatient): ");int t=sc.nextInt();sc.nextLine();
            System.out.print("Patient ID: ");String id=sc.nextLine();
            System.out.print("Name: ");String name=sc.nextLine();
            System.out.print("Age: ");int age=sc.nextInt();
            if(t==1){System.out.print("Days: ");int d=sc.nextInt();System.out.print("Rate per day: ");double r=sc.nextDouble();list.add(new InPatient(id,name,age,d,r));}
            else if(t==2){System.out.print("Consultation Fee: ");double f=sc.nextDouble();list.add(new OutPatient(id,name,age,f));}
        }
        for(Patient p:list){p.getPatientDetails();}
    }
}

