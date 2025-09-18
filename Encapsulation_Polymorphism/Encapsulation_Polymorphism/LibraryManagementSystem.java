package Encapsulation_Polymorphism;
import java.util.*;

interface Reservable{
    void reserveItem(String user);
    boolean checkAvailability();
}

abstract class LibraryItem{
    private String itemId,title,author,borrower;
    public LibraryItem(String i,String t,String a){itemId=i;title=t;author=a;}
    public String getItemId(){return itemId;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    protected void setBorrower(String b){borrower=b;}
    protected String getBorrower(){return borrower;}
    public abstract int getLoanDuration();
    public void getItemDetails(){System.out.println("ID:"+itemId+" | Title:"+title+" | Author:"+author+" | Loan:"+getLoanDuration()+" days | Borrower:"+(borrower==null?"None":borrower));}
}

class Book extends LibraryItem implements Reservable{
    private boolean available=true;
    public Book(String i,String t,String a){super(i,t,a);}
    public int getLoanDuration(){return 14;}
    public void reserveItem(String u){if(available){setBorrower(u);available=false;}}
    public boolean checkAvailability(){return available;}
}

class Magazine extends LibraryItem implements Reservable{
    private boolean available=true;
    public Magazine(String i,String t,String a){super(i,t,a);}
    public int getLoanDuration(){return 7;}
    public void reserveItem(String u){if(available){setBorrower(u);available=false;}}
    public boolean checkAvailability(){return available;}
}

class DVD extends LibraryItem implements Reservable{
    private boolean available=true;
    public DVD(String i,String t,String a){super(i,t,a);}
    public int getLoanDuration(){return 3;}
    public void reserveItem(String u){if(available){setBorrower(u);available=false;}}
    public boolean checkAvailability(){return available;}
}

public class LibraryManagementSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<LibraryItem> items=new ArrayList<>();
        System.out.print("Enter number of items: ");int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Type (1-Book,2-Magazine,3-DVD): ");int t=sc.nextInt();sc.nextLine();
            System.out.print("Item ID: ");String id=sc.nextLine();
            System.out.print("Title: ");String title=sc.nextLine();
            System.out.print("Author: ");String author=sc.nextLine();
            if(t==1)items.add(new Book(id,title,author));
            else if(t==2)items.add(new Magazine(id,title,author));
            else if(t==3)items.add(new DVD(id,title,author));
        }
        System.out.print("Enter borrower name to reserve all items: ");String borrower=sc.nextLine();
        for(LibraryItem li:items){
            if(li instanceof Reservable){
                Reservable r=(Reservable)li;
                if(r.checkAvailability())r.reserveItem(borrower);
            }
            li.getItemDetails();
        }
    }
}
