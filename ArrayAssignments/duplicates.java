package ArrayAssignments;
import java.util.ArrayList;

public class duplicates {
	public static void main(String[] args) {
		int arr[]= {4,67,1,3,4,7,4,1};
		System.out.println(duplicates(arr));
	}

	public static ArrayList<Integer> duplicates(int arr[]) {
		ArrayList list=new ArrayList<>();
	
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length;j++) {
					if (arr[i]==arr[j]) {
						if(list.contains(arr[i])) {
							break;
						}
						else {
							list.add(arr[i]);
						}
					}
			}
		}
		
		return list;
	}
}
