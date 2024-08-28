public class Book{
    private String id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;

    }
    public void issueBook() {
        this.isIssued = true;

    }

    public void returnBook(){
        this.isIssued = false;
    }

    @Override
    public String toString(){
        return "Book Id=" + id + ", title=" + title + ", author=" + author + ", Issued: " + isIssued;
    }

    public boolean isIssued() {
        return isIssued;
    }
}