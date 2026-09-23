public class Practice_1{
        static void main(String[] args) {
                System.out.println("5 + 6 = " + add(5, 6));
                System.out.println("12 - 7 = " + subtract(12, 7));
                System.out.println("18 * 5 = " + multiply(18, 5));
                System.out.println("56 / 3 = " + divide(56, 3));
        }
        public static int add(int a, int b){
                return a + b;
        }
        public static int subtract(int a, int b){
                return a - b;
        }
        public static int multiply(int a, int b){
                return a * b;
        }
        public static int divide(int a, int b){
                return a / b;
        }
}