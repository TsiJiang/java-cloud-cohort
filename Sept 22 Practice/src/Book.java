public class Book {
    private final int id;
    private String title;
    private String author;

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public Book(int id, String title, String author) {
        if (id < 0) {
            //System.out.println("Invalid ID");
            throw new IllegalArgumentException("Invalid ID: ID cannot be negative.");
        } else {
            this.id = id;
            this.title = title;
            this.author = author;
        }
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

}
