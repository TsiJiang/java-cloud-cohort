public class Ex09 {
    public static void main(String[] args) {
        /*
        Declare int studentsEnrolled = 24; and int classCapacity = 30; along with a boolean variable, then print the answers to five true/false questions.
        Also declare boolean hasLaptop = true;
        Print whether the class is full, using ==
        Print whether there are open seats, using <
        Print whether enrollment is different from capacity, using !=
        Print whether enrollment is at least 30, using >=
        Print the value of hasLaptop
        Each line must be written as a question (e.g., Is the class full? false).
         */
        int studentsEnrolled = 24, classCapacity = 30;
        boolean hasLaptop = true, answer = false;
        if (classCapacity == studentsEnrolled) {
            answer = true;
        }else{
            answer = false;
        }
        System.out.println("Is the class full? " + answer + "\n");
        if (studentsEnrolled < classCapacity) {
            answer = true;
        }else{
            answer = false;
        }
        System.out.println("Are there open seats? " + answer + "\n");
        if(studentsEnrolled != classCapacity){
            answer = true;
        }else{
            answer = false;
        }
        System.out.println("Is enrollment different from capacity? " + answer + "\n");
        if(studentsEnrolled >= 30){
            answer = true;
        }else{
            answer = false;
        }
        System.out.println("Is enrollment at least 30? " + answer + "\n");
        System.out.println("Do I have a laptop? " + hasLaptop + "\n");
    }
}