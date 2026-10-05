import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] a = {0,3,0,7,0};
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        /* too complex and unnecessary
        System.out.println(Arrays.toString(a)
                                .replace("[","")
                                .replace("]","")
                                .replace(",","")
                                .replace(" ", "\n")
                                .concat("\n"));

         */
        Arrays.stream(a).forEach(System.out::println); //clear and concise
        int total = 0;
        for(int i : a) {
            total += i;
        }
        System.out.println(total);
    }
}