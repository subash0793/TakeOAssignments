package ArrayAssignments;

import java.util.Arrays;

public class largestElement_Kth_Position {
public static void main(String[] args) {
	int arr[]= {4,7,1,3,5};
	int position=4;
	System.out.println(" the largest element in "+ position+"th  position is :"+(largestKth(arr,3)));
}
public static int largestKth(int arr[], int k) {
	Arrays.parallelSort(arr);
	return arr[arr.length-k];
}
}
