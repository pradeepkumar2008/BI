package library.transactions;
public class Transaction {
    public void issueBook(String member, String book) {
        System.out.println("Book '" + book + "' issued to " + member);
    }
}