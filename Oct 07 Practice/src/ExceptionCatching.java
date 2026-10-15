void main(String[] args) {

}
public static double avg(int[] a){
    // if a is null or length == 0, throw IllegalArgumentException
    double ans = 0.0;
    try{
        for (int i : a){
            ans += i;
        }
    } catch (IllegalArgumentException e){
        System.out.println("The array is invalid");
        return -1.0;
    }
    ans = ans / a.length;
    return ans;
    // else compute average
}