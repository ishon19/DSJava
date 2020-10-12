package ds.problems.arrays;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 65, 89};
        int idx = search(arr, 68);
        System.out.println("Index for 65: "+idx);
    }

    public static int search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val) return i;
        }
        return -1;
    }
}
