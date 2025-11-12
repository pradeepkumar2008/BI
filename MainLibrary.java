import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class MainLibrary {
    public static void main(String[] args) {
        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();
        b.addBook("Java Programming");
        m.registerMember("Aman");
        t.issueBook("Aman", "Java Programming");
    }
}