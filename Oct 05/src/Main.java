import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean[] boolArray = new boolean[3];
        for(boolean b : boolArray){
            System.out.print(b + ", ");
        }
        int[] intArray = {98, 96, 99, 12, 75, 23, 99};
        System.out.println("\nMax value in intArray: " + max(intArray));
        System.out.println("Sum of all values in intArray: " + sum(intArray));
        System.out.println("Does intArray contain 99: " + contains(intArray, 99));
        System.out.println("The index of the value 99 in intArray is ["
                + findIndex(intArray, 99)
                + "] which means that it is found in position "
                + (findIndex(intArray, 99) + 1));
        if (findIndex(intArray, 27) == -1) {
            System.out.println("The value 27 does not exist in intArray");
        } else {
            System.out.println("The index of the value 27 is: " + findIndex(intArray, 27));
        }
        System.out.println("Average of  all values in intArray: " + average(intArray));
        System.out.println("There are " + countEvens(intArray) + " even numbers in intArray");
        int[] originalArray = copy(intArray);
        printArray(intArray);
        reverse(intArray);
        printArray(intArray);
        bubbleSort(intArray);
        printArray(intArray);
        printArray(originalArray);
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        int[][] m = {{1,2,3},{4,5,6}};
        System.out.println("The sum of int[][] m is: " + sumMatrix(m));
        for (int[] i : m){
            printArray(i);
        }
        int[] newArray = dedupe(originalArray);
        printArray(newArray);

    }
    public static int max(int[] arr){
        int ans = arr[0];
        for (int i : arr){
            if (i > ans){
                ans = i;
            }
        }
        return ans;
    }
    public static int sum(int[] arr){
        int ans = 0;
        for (int i : arr){
            ans += i;
        }
        return ans;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    public static boolean contains(int[] arr, int target){
        for (int i : arr){
            if (i == target){
                return true;
            }
        }
        return false;
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static double average(int[] arr){
        double arrayAvg = 0.0;
        for (int i : arr){
            arrayAvg += i;
        }
        arrayAvg /= arr.length;
        return arrayAvg;
    }
    public static int findIndex(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int[] copy(int[] src){
        int[] duplicate = new int[src.length];
        for(int i = 0; i < src.length; i++){
            duplicate[i] = src[i];
        }
        return duplicate;
    }
    public static int countEvens(int[] arr){
        int ans = 0;
        for(int i : arr){
            if (i % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
    public static int sumMatrix(int[][] m){
        int sumOfM = 0;
        for (int[] ints : m) {
            for (int anInt : ints) {
                sumOfM += anInt;
            }
        }
        return sumOfM;
    }
    public static int[] merge(int[] a, int[] b){
        int[] merged = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++){
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            merged[i + a.length - 1] = b[i];
        }
        return merged;
    }
    public static int[] dedupe(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            int comparisonInt = arr[i];
            boolean shouldICopy = true;
            for (int j = 0; j < arr.length; j++){
                if (i !=  j && comparisonInt == arr[j]){
                    for(int k : newArr){
                        if (k == comparisonInt){
                            shouldICopy = false;
                            break;
                        }
                    }
                }
            }
            if(shouldICopy){
                newArr[i] = comparisonInt;
            }
        }
        return newArr;
    }

}