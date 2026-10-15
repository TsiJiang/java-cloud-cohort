import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main{
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        boolean done = false;
        do{
            String bookName = null;
            String bookAuthor = null;
            Scanner input = new Scanner(System.in);
            while (bookName == null){
                System.out.print("Please enter the book name: ");
                bookName = input.nextLine();
            }
            while (bookAuthor == null){
                System.out.print("Please enter the book author: ");
                bookAuthor = input.nextLine();
            }
            UUID id = UUID.randomUUID();
            library.add(new Book(id, bookName, bookAuthor));
            System.out.println(bookName + " has been created!");
            input.nextLine();
            System.out.println("Add another book to the library? ");
            if ("yes".equalsIgnoreCase(bookName = input.nextLine()) || "y".equalsIgnoreCase(bookAuthor)){

            } else {
                done = true;
                bookAuthor = null;
                bookName = null;
            }
        } while(!done);
        for (Book book : library){
            System.out.println(book.toString());
        };
    }
}