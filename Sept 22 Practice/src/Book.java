public class Book {
    private int id;
    private String title;
    private String author;

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void newBook(int id, String title, String author) {
        if (this.id < 0) {
            System.out.println("Invalid ID");
        } else {
            this.id = id;
            this.title = title;
            this.author = author;
        }
    }
    public void setTitle(int id, String title) {
        if (this.id < 0) {
            System.out.println("Invalid ID");
        }else{
            this.title = title;
        }

    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(int id, String author) {
        if (this.id < 0) {
            System.out.println("Invalid ID");
        }else {
            this.author = author;
        }
    }

}
