// finf the nth smallest element in an array
// e.g., 7,5,6,2,3 -> 3rd smallest element is 5

public class FindNSmallestEle {
    public static void main(String[] args) {
        int[] arr = {7,5,6,2,3};
        int rank = 3;

        int i, temp, ele;
		int size = arr.length;
		for(i=0;i<(size-1);i++){
			ele=i;
			for(int j=i+1 ; j<size ; j++){
				if( arr[j]<arr[ele] )
					ele=j;
			}
			temp=arr[i];
			arr[i]=arr[ele];
			arr[ele]=temp;
			rank--;
			if (rank==0)
				break;
			else
				continue;
		}
        System.out.println(arr[i]);
    }
}    