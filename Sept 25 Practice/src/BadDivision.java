

public class BadDivision {
    public static void main(String[] args) {
        divideInt(12, 0);

    }

    public static int divideInt(int dividend, int divisor) {
        try {
            return (dividend / divisor);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero! ");
            return 0;
        }
    }
}