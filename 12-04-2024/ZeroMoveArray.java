import java.util.Arrays;

public class ZeroMoveArray {
    public static void main(String[] args) {
        int[] array = {1,5,0,2,0,5,6,2};
        int size = 8;

        // Method 1 
        // int count = 0;
        // int[] result = new int[size];
        // for (int i : array) {
        //     if (i == 0) {
        //         count++;
        //     }
        // }
        // for (int i = 0 ; i< size; i++) {
        //     if (array[i] != 0) {
        //         result[count++] = array[i];
        //     }
        // }

        // Method 2
        int count = 0;
        int point_nonzero = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
            
            }

        System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.toString(r esult));
    }
}
}