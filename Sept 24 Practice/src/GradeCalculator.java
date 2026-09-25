import java.util.Scanner;

public class GradeCalculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of assignments: ");
        int assignments = input.nextInt();
        int[] studentGrades = new int[assignments];
        int finalGrade = 0;
        for(int i = 0; i < assignments; i++) {
            studentGrades[i] = EachGrade();
            finalGrade += studentGrades[i];
        }
        finalGrade /= assignments;
        System.out.println("Final Grade = " + finalGrade);
        input.close();
    }
    public static int EachGrade(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter Score (0 - 100): ");
        int score = scanner.nextInt();
        //TODO Validate the range and assign A/B/C/D/F using if/else.
        if(score > 100 || score < 0){
            System.out.println("Invalid Score");
        }else if(score >= 90){
            System.out.println("Grade: A");
        }else if(score >= 80){
            System.out.println("Grade: B");
        }else if (score >= 75){
            System.out.println("Grade: C");
        }else if (score >= 70){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
        //scanner.close();
        return score;
    }
}