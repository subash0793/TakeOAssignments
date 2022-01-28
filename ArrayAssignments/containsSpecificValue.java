package ArrayAssignments;
import java.util.Scanner;

public class containsSpecificValue {
	public static void main(String[] args) {
		//create an array
		int arr[]=userInputArray();
		//find an average
		System.out.println();
		containsSpecific(arr, 4);
		
	}
	//this creates an array with size specified by user
			public static int [] userInputArray() {
				
				Scanner scan=new Scanner(System.in);
				System.out.println("enter the size of array to work on");
				int size=scan.nextInt();
				int arr[]=new int[size];
				
				for (int i =0; i<size; i++) {
					System.out.println("enter the array for position "+ i);
					int val=scan.nextInt();
					arr[i]=val;
				}
				return arr;
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
	
		
		
}
