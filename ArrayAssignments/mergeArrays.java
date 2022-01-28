package ArrayAssignments;

import java.util.Arrays;

public class mergeArrays {
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {3,4,5,6};
		System.out.println(Arrays.toString(mergeArray(arr1,arr2)));
	}
	public static int[] mergeArray(int arr1[], int arr2[]) {
		int totalLength=arr1.length+arr2.length;
		int arrNew[]=new int[totalLength];
	
		for (int i=0; i<arr1.length; i++) {
			arrNew[i]=arr1[i];
		
			
		}
		for (int j=0; j<arr2.length;j++) {
			arrNew[j+arr1.length]=arr2[j];
		}
		return arrNew;
	}

}
