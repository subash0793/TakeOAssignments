package ArrayAssignments;
import java.util.Arrays;

public class maxMinValue {
public static void main(String[] args) {
	int arr[]= {5,3,9,10,23,2};
	System.out.println(maxMin(arr));
}
public static String maxMin(int arr[]) {
	int Maxval=arr[0];
	int minval=arr[0];
	for (int i=0; i <arr.length-1; i++) {
		if (arr[0]<arr[i+1]) {
			Maxval=arr[i+1];	
		}
		if(arr[0]>arr[i+1]) {
			minval=arr[i+1];
			
		}
		
	}

	return ("max : "+Maxval+ " min : "+minval);
}
}
