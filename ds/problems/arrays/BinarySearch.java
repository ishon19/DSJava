package ds.problems.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {34, 54, 77, 45, 755, 7};
        System.out.println(binarySearch(arr, 755));
    }

    public static int binarySearch(int[] arr, int val) {
        sort(arr);
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(val==arr[mid]) return mid;
            else if(val > arr[mid]){
                low = mid+1;
            } else if(val<arr[mid]) {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void sort(int[] arr){
        java.util.Arrays.sort(arr);
    }
}
