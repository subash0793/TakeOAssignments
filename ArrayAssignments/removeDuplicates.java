package ArrayAssignments;

import java.util.Arrays;

public class removeDuplicates {
	static int lastpointer;

	public static void main(String[] args) {
		int arr[] = { 4, 2, 6, 2, 4, 6, 7, 9, 9 };
		// 2,2,4,4,6,6,7
		Arrays.parallelSort(arr);
		// System.out.println(Arrays.toString(removeDuplicates(arr)));
		print(removeDuplicates(arr));
	}

	// one way to do it
	public static int[] removeDuplicates(int arr[]) {
		int temp[] = new int[arr.length];
		if (arr.length < 1) {
			return arr;
		} else {
			int j = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) { // if current index value element is same as the next, increase the index
											// value
					i++;
					// continue;
				}
				temp[j++] = arr[i]; // increase the pointer for j and store the value in jth index for the element
									// in array's ith index
			}
			if (temp[--j] != arr[arr.length - 1]) { // we need this as we cannot go out of bound on i, so
				// the last element should be added checking if there is no duplicate
				temp[j] = arr[arr.length - 1];
			}
			lastpointer = j;
		}

		return temp;
	}

	// print method to print the array upto the packed elements
	public static void print(int arr[]) {
		for (int i = 0; i <= lastpointer; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
