public class Ex10 {
    public static void main(String[] args) {
        /*
        Declare String studentName and String programName.
        Declare double tuition = 6500.00; and double deposit = 500.00; and int numberOfPayments = 5;
        Calculate double balance as tuition minus deposit.
        Calculate double monthlyPayment as balance divided by numberOfPayments.
        Print the receipt exactly as shown in the expected output, including the lines of = and - characters.
        Do not hard-code the values 6000 or 1200 anywhere in your program. These must be computed by your code.
         */
        String studentName = "Xavier Long", programName = "Java and Cloud Computing";
        double tuition = 6500.00, deposit = 500.00;
        int numberOfPayments = 5;
        double balance = tuition - deposit;
        double monthlyPayment = balance / numberOfPayments;
        System.out.println("===== SKILLSPIRE PAYMENT PLAN ====="+ "\n");
        System.out.println("Student: " + studentName + "\n");
        System.out.println("Program: " + programName + "\n");
        System.out.println("-----------------------------------" + "\n");
        System.out.println("Tuition: $" + tuition + "\n");
        System.out.println("Deposit Paid: $" + deposit + "\n");
        System.out.println("Payments: " + numberOfPayments + "\n");
        System.out.println("Monthly Payment: $" + monthlyPayment + "\n");
        System.out.println("===================================" + "\n");
    }
}