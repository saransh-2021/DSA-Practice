// Given an array, fin the count of elements such that array[i] > array[i-1] and array[i] > array[i+1]
// e.g., 5,6,2,1 -> Answer: 1 (6 is the only element that satisfies the condition)

public class CountAdjacentSmallNumber {
    public static void main(String[] args) {
        int[] arr = {7,5,6,2,3};
        int count = 0;
        if (arr[0] > arr[1]){
            count++;
        }
        if(arr[arr.length-1] > arr[arr.length-2]){
            count++;
        }
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
