import java.util.HashMap;

public class ArrayCountOccurncs{
	public static void main(String[] args){	

		int arr[]={3,4,2,7,2,3,3,2};
		int size=arr.length;
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

		for (int i = 0; i < size; i++) {

            Integer c = hmap.get(arr[i]);
 
            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            }
 
            else {
                hmap.put(arr[i], ++c);
            }
		}
		System.out.println(hmap);
	}
}