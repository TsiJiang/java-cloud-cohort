import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("The first \"Bob\" is found at index "
                        + names.indexOf("Bob")
                        + ". The last \"Bob\" is found at index "
                        +names.lastIndexOf("Bob") + ".");
        ArrayList<String> cart = new ArrayList<>(List.of("Laptop", "Mouse"));
        cart.remove("Mouse");
        cart.stream().forEach(System.out::println);
        ArrayList<Integer> scores = new ArrayList<>(List.of(99, 0, 50, 45, 52));
        int sum = 0;
        for(int score : scores){
            sum += score;
        }
        System.out.println(sum);
        System.out.println(max(scores));
        for (int i = names.size() - 1; i >= 0; i--){
            System.out.println(names.get(i));
        }
    }
    public static int max(ArrayList<Integer> a){
        int max = a.get(0);
        for (int i : a){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
}