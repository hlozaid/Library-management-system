import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Admin admin = new Admin(library);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("\nLibrary Management System \n1. Add Book \n2. Add User \n3. Issue Book \n4. Return Book \n5. View Books \n6. View Users \n7. Exit \nChoose an Option: ");
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter Book Id: ");
                    String bookId = scanner.next();
                    System.out.println("Enter Book Title: ");
                    String bookTitle = scanner.next();
                    System.out.println("Enter Book Author: ");
                    String bookAuthor = scanner.next();
                    admin.addBook(bookId, bookTitle, bookAuthor);
                    break;

                case 2: // add Users
                    System.out.println("Enter User Id: ");
                    String userId = scanner.next();
                    System.out.println("Enter User Name: ");
                    String userName = scanner.next();
                    admin.addUser(userId, userName);
                    break;

                case 3:
                    System.out.println("Enter Book Id to Issue : ");
                    String issueId = scanner.next();
                    System.out.println("Enter USer Id to Issue:  ");
                    userId = scanner.next();
                    admin.issueBook(issueId, userId);
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    bookId = scanner.next();
                    admin.returnBook(bookId);
                    break;
                case 5:
                    admin.viewBooks();
                    break;
                case 6:
                    admin.viewUsers();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        }
    }
}