public class Admin {
    private Library library;

    public Admin(Library library){
        this.library = library;
    }

    public void addBook(String id, String title, String author){
        Book book = new Book(id, title, author);
        library.addBook(book);
        System.out.println("Book added successfully");
    }

    public void addUser(String id, String name){
        User user = new User(id, name);
        library.addUser(user);
        System.out.println("User added successfully");
    }

    public void issueBook(String bookId, String userId) {
        library.issedBook(bookId, userId);
    }

    public void returnBook(String bookId){
        library.returnBook(bookId);
    }

    public void listBooks(){
        library.showBooks();
    }

    public void listUsers(){
        library.showUsers();
    }

    public void viewBooks() {
        library.showBooks();
    }

    public void viewUsers() {
        library.showUsers();
    }
}