package ds.problems.arrays;

public class ElementSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("The sum of the array is: "+ getSum(arr));
    }

    public static long getSum(int[] arr) {
        long sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
}
