import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
//    public static void main(String[] args) {
//        // A) sayHi();              Incorrect
//        Utils.sayHi();            //Correct
//        // C) new Utils().sayHi();  Incorrect
//    }
public static int areEven(int[] arr){
    int evenNumbers = 0;
    for(int index : arr){
        if(index % 2 == 0){
            evenNumbers++;
        }
    }
    return evenNumbers;
}
    public static void main(String[] args) {
        // A) Car.drive();              Incorrect
        //new Car().drive();            //Correct
        // C) drive();                  Incorrect
        //System.out.println(MathUtil.square(5));
        //ClassCounter counter = new ClassCounter();
        //System.out.println(counter.inc(5));
        /*
        int[] nums = new int[10];               //initialize int array
        for(int i = 0; i < nums.length; i++){   //step through array
            nums[i] = i*10;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[5]);
        int[] nums2 = {0, 20, 40, 60, 80, 100, 120, 140, 160, 180}; //initialize int array with
                                                                    // prefilled values
        System.out.println(Arrays.toString(nums2));
        System.out.println(nums2[8]);
        String[] names = new String[5];
        names[0] = "Joey";
        names[1] = "Kain";
        names[2] = "Alisha";
        names[3] = "Matthew";
        names[4] = "Sonya";
        System.out.println(names[3].length());
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("Joshua".length());
        int[] invertedNums = Arrays.stream(nums)
                                    .boxed()
                                    .sorted(Collections.reverseOrder())
                                    .mapToInt(Integer::intValue)
                                    .toArray();

        int[] class5Grades = {99, 95, 75, 83, 60};
        double average = (double) Arrays.stream(class5Grades).sum() / class5Grades.length;
        System.out.println("Class 5 Average: " + average);
        System.out.println("Class 5 Average using stream: " + Arrays.stream(class5Grades)
                                                                    .average()
                                                                    .orElse(0.0));
        int[] minArray = {5, 18, 100, -17, 0};
        int minimum = Arrays.stream(minArray).min().orElse(0);
        System.out.println("Minimum: " + minimum);
        int[] bigOArray = {
                84, 12, 67, 3, 91, 45, 78, 22, 59, 14,
                33, 95, 0, 71, 52, 88, 6, 41, 74, 29,
                63, 17, 81, 38, 55, 9, 70, 48, 83, 25,
                61, 99, 11, 76, 43, 50, 5, 87, 31, 66,
                19, 92, 57, 4, 79, 36, 68, 15, 82, 21,
                47, 94, 2, 73, 58, 86, 8, 39, 62, 27,
                65, 100, 13, 80, 49, 54, 7, 89, 34, 72,
                23, 97, 51, 1, 75, 42, 69, 16, 85, 20,
                44, 93, 10, 77, 53, 60, 24, 90, 35, 64,
                18, 96, 56, 26, 82, 37, 46, 30, 98, 40
        };
        System.out.println("Average of Big 0 Array: " + Arrays.stream(bigOArray)
                                                                .average()
                                                                .orElse(0.0));
        */
        /*
        int[] bigOArray = {
                84, 12, 67, 3, 91, 45, 78, 22, 59, 14,
                33, 95, 0, 71, 52, 88, 6, 41, 74, 29,
                63, 17, 81, 38, 55, 9, 70, 48, 83, 25,
                61, 99, 11, 76, 43, 50, 5, 87, 31, 66,
                19, 92, 57, 4, 79, 36, 68, 15, 82, 21,
                47, 94, 2, 73, 58, 86, 8, 39, 62, 27,
                65, 100, 13, 80, 49, 54, 7, 89, 34, 72,
                23, 97, 51, 1, 75, 42, 69, 16, 85, 20,
                44, 93, 10, 77, 53, 60, 24, 90, 35, 64,
                18, 96, 56, 26, 82, 37, 46, 30, 98, 40
        };
        int[] bigOArray2 = {
                42, 87, 14, 99, 3, 66, 21, 55, 78, 10,
                91, 33, 5, 73, 49, 82, 16, 60, 27, 88,
                0, 44, 69, 12, 95, 38, 57, 81, 6, 50,
                74, 19, 85, 31, 63, 8, 92, 47, 54, 70,
                25, 61, 97, 15, 83, 36, 52, 4, 77, 22,
                89, 41, 65, 1, 94, 34, 58, 80, 11, 46,
                68, 13, 96, 51, 23, 76, 30, 84, 7, 62,
                43, 90, 18, 53, 79, 2, 67, 35, 59, 100,
                29, 72, 48, 86, 17, 64, 9, 93, 26, 75,
                32, 56, 20, 82, 45, 71, 24, 98, 39, 15
        };
        System.out.println("Number of even numbers in Big O Array: " + areEven(bigOArray));
        //easier method to find evens in bigOArray
        System.out.println("Even: "+ Arrays.stream(bigOArray2).filter(n -> n % 2 == 0).count());

         */
        //MultiDimensional Arrays
        int[][] matrix= new int[2][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i+1) * (j+1);
            }
        }
        System.out.println(Arrays.deepToString(matrix)
                    .replace("], [", "]\n[")
                    .replace("[[","[")
                    .replace("]]","]"));
        //OR
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
    }

}
