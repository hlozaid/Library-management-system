import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;
    private Map<String, User> users;

    public Library() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }
    public void addUser(User user) {
        users.put(user.getId(), user);
    }
    public Book getBook(String id) {
        return books.get(id);
    }
    public User getUser(String id) {
        return users.get(id);
    }

    public void issedBook(String bookId, String userId) {
        Book book = books.get(bookId);
        User user = users.get(userId);

        if(book != null && book.isIssued()) {
            book.returnBook();
            System.out.println("Book Returned.");
        } else{
            System.out.println("Book is either not issued or not returned.");
        }

    }

    public void showBooks(){
        for(Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void showUsers(){
        for(User user : users.values()) {
            System.out.println(user);
        }
    }


    public void returnBook(String bookId) {
        this.books.remove(bookId);
    }
}
