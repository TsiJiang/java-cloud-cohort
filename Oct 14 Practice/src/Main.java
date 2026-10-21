import java.util.*;
import java.util.random.RandomGenerator;

public class Main{
    public static void main(String[] args) {
        /*
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

         */
        //Create an ArrayList<Integer> with 10 numbers, then print the sum.
        ArrayList<Integer> tenNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tenNumbers.add(i);
        }
        int sum = tenNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        //Store 5 names in an ArrayList and print them in reverse order.
        ArrayList<String> names = new ArrayList<>(List.of("James", "John", "Luke", "Matthew", "Mary"));
        Collections.reverse(names);
        for(String name : names){
            System.out.println(name);
        }
        Collections.reverse(names);
        //Create a shopping cart using an ArrayList<String> with add/remove functionality.
        ArrayList<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Potato");
        shoppingCart.add("Peanut Butter");
        shoppingCart.add("Strawberry Jam");
        shoppingCart.add("Wheat Sandwich Bread");
        shoppingCart.remove("Potato");
        //Write a program that finds the maximum number in an ArrayList<Integer>.
        RandomGenerator random = new Random();
        ArrayList<Integer> maxNumber = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            maxNumber.add(random.nextInt(50));
        }
        System.out.println(maxNumber.stream().max(Integer::compareTo).orElse(0));
        maxNumber.stream().forEach(System.out::println);
        //Build a student management system using ArrayList<Student>.
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Xavier Long", 38));
        students.add(new Student("James", 40));
        students.add(new Student("John", 60));
        students.add(new Student("Luke", 70));
        students.add(new Student("Matthew", 80));
        students.add(new Student("Mary", 90));
        //Use Collections.sort() to alphabetically sort a list of cities.
        //Create a playlist that supports adding, removing, and displaying songs.

    }
}