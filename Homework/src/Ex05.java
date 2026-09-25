public class Ex05  {
    public static void main(String[] args) {
        /*
        Declare int totalSlices = 7; and int people = 2;
        Print totalSlices / people with the label "Integer division: "
        Print totalSlices % people with the label "Remainder: "
        Print totalSlices / 2.0 with the label "Decimal division: "
        Print (double) totalSlices / people with the label "Decimal division with a cast: "
        At the bottom of your file, add a comment (one sentence) explaining why the first and third lines give different results.
         */
        int totalSlices = 7;
        int people = 2;
        System.out.println("Integer division: " + (totalSlices / people) + "\n");
        System.out.println("Remainder: " + (totalSlices % people) + "\n");
        System.out.println("Decimal Division: " + (totalSlices / 2.0) + "\n");
        System.out.println("Decimal Division with a cast: " + (double)totalSlices / people + "\n");

        //Matching input types equals answer of same data type.
    }
}