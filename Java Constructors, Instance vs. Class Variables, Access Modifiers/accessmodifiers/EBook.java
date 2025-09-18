package accessmodifiers;

public class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("111-XYZ", "Java Basics", "Ravi Kumar");
        ebook.displayBookDetails();
    }
}
