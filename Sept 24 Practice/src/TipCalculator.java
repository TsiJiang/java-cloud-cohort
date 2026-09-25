import java.util.Scanner;

public class TipCalculator {
    public static Scanner s = new Scanner(System.in);
    static void main(String[] args) {
        //Ask for the bill total
        System.out.print("Please enter the bill total: ");
        double bill = s.nextDouble();
        //Ask for the tip percentage
        System.out.println("Please enter the tip percentage: ");
        double tipPercent = s.nextDouble();
        //Calculate tip and final total
        double tipValue = tipPercent * 0.01 * bill;
        double finalCalculation = bill + tipValue;
        //print both values
        System.out.printf("Bill = $%.2f%n", bill);
        System.out.println("Tip Percent = " + tipPercent +"%");
        System.out.printf("Actual Tip = $%.2f%n", tipValue);
        System.out.printf("Total = $%.2f%n", finalCalculation);
    }
}