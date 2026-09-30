public static int[] calc(int a, int b){

    int sum = a + b;
    int product = a * b;
    return new int[]{sum, product};
}

public static int max(int[] a){
    int max = a[0];
    for (int i : a ){
        if (i > max){
            max = i;
        }
    }
    return max;
}

void main(String[] args) {
    System.out.println(calc(6, 7));
    int[] intArray = new int[] {1,2,3};
    System.out.println(max(intArray));
}