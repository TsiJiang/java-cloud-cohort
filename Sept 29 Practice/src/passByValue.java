public static void inc(int x){
    x = x + 1;
    System.out.println("Inside: " + x);
}
public static void main(String[] args){
    int n = 5; inc(n);
    System.out.println("Outside: " + n);
}