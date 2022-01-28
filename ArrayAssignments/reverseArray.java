package ArrayAssignments;
import java.util.Arrays;

public class reverseArray {
public static void main(String[] args) {
	int arr[]= {5,4,8,11,10};
	System.out.println(Arrays.toString(reverseArray(arr)));
}
public static int [] reverseArray(int arr[]) {
	
	int last=arr.length-1;
	for (int i=0; i <arr.length/2; i++) {
		
		int temp=arr[i];
		arr[i]=arr[last];
		arr[last]=temp;
		last--;
	}
	
	return arr;
}
}
