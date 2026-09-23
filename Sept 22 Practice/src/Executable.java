public class Executable {
    static void main(String[] args) {
        Book thomasTheTankEngine = new Book();
        thomasTheTankEngine.newBook(0, "Thomas the Tank Engine", "Xavier Long");
        System.out.println("Title: "+thomasTheTankEngine.getTitle());
        System.out.println("Author: "+thomasTheTankEngine.getAuthor());
    }
}
