public class Ex07  {
    public static void main(String[] args) {
        /*
        Declare double exactScore = 87.9; then create int wholeScore by casting it with (int). Print both.
        Declare int studentCount = 24; then assign it to a double variable. Print it.
        Declare char grade = 'A'; then assign it to an int variable. Print both in one sentence.
        In a comment, answer the following: when 87.9 was cast to an int, was the value rounded or cut off?
         */
        double exactScore = 87.9;
        int wholeScore = (int)exactScore;
        System.out.println("Exact Score: " + exactScore + "\n");
        System.out.println("After casting to int: " + wholeScore + "\n");
        int studentCount = 24;
        double studentDoubleCount = (double)studentCount;
        System.out.println("Student Count as a double: " + studentDoubleCount + "\n");
        char grade = 'A';
        int gradeInt = (int)grade;
        System.out.println("The character " + grade + " is the number "+ gradeInt + "\n");
        //When 87.9 was cast to an int, the value was cut off to 87 instead of being rounded to 88.
    }
}