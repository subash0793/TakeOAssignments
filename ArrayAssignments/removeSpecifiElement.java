package ArrayAssignments;
import java.util.Arrays;

public class removeSpecifiElement {
public static void main(String[] args) {
	int arr1[]= {4,3,8,6,5,32};
	removeElement(arr1,6);
}
public static boolean containsSpecific(int arr[], int target) {
	if(arr.length<1) {
		System.out.println("no items in array");
		
	}
	else {
		for (int i =0; i<arr.length; i++) {
			if (arr[i]==target) {
				System.out.println("found at index "+i);
				return true;
			}
		}
	}
	System.out.println(target + " not found in the array");
return false;
}


public static void removeElement(int ar[], int target) {
	boolean found=containsSpecific(ar,target);
	if ( found==true) {
	int temp[]=new int[ar.length-1];
		for (int i=0,j=0; i<ar.length; i++) {
			if (ar[i]==target) {
				System.out.println("removing element "+target);
				continue;
				}
			temp[j++]=ar[i];
			}
		System.out.println(Arrays.toString(temp));
		}
}
	
}


