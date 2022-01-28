package ArrayAssignments;

import java.util.Scanner;

public class averageValue {
	public static void main(String[] args) {
		//create an array
		int arr[]=userInputArray();
		//find an average
		System.out.println(average(arr));
		
		
	}
	//this finds the average
	public static double average(int arr[]) {
		int length=arr.length;
		double totalSum=0.0;
		for(int i:arr) {
			totalSum+=i;
		}
		double average=(totalSum/length);
		return (average);
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
}
