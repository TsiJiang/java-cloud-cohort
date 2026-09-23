public class Ex06  {
    public static void main(String[] args) {
        /*
        Declare three double variables with the values 90.0, 85.0, and 95.0. Compute their total and average, then print both.
        REQUIREMENTS
        Store the three scores in three separate double variables.
        Store the sum of the three scores in a variable named total.
        Compute the average by dividing total by 3, and store it in a variable named average.
        Print the total and the average on two labeled lines.
         */
        double num1 = 90.0, num2 = 85.0, num3 = 95.0, total, average;
        total = num1 + num2 + num3;
        average = (num1 + num2 + num3) / 3.0;
        System.out.println("Total: " + total + "\n");
        System.out.println("Average: " + average + "\n");
    }
}