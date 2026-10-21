public class Book extends Product{
    private String author;
    public Book(String name, Double price, String author){
        super(name, price);
        setAuthor(author);
    }
    public Book(String name, Double price){
        super(name, price);
        setAuthor("Unknown Author");
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}