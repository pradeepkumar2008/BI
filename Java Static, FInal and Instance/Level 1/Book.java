public class Book {

    static String libraryName = "My Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void showLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void showBook() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling", "123456");
        showLibraryName();
        b1.showBook();
    }
}
