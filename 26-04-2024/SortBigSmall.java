// given an array of integers of integers. sort the array in such a way that they alternate
// between bigger and smaller numbers. The first element should be the biggest, the second
// should be the smallest, the third should be the second biggest, the fourth should be the
// second smallest etc. If it is not possible to sort the array in such a way, return -1.

// Example: 2,9,4,10,5,20,3
// Output: 3,2,5,4,10,9,20

import java.util.Arrays;

public class SortBigSmall {
    public static void main(String[] args) {
        int[] arr = {2,9,4,10,5,20,3};
        AlternateBiggerSmaller(arr);
    }

    static void AlternateBiggerSmaller(int[] arr){
        Arrays.sort(arr);
        int[] res = new int[arr.length];
        int k=0;
        for (int i = 0; i < res.length-1; i=i+2) {
            res[k++] = arr[i+1];
            res[k++] = arr[i];
        }
        if (arr.length % 2 != 0) {
            res[k] = arr[arr.length-1];
        }
        System.out.println(Arrays.toString(res));
    }
}