package ArrayAssignments;

import java.util.Arrays;

public class frequencyOfNumber {
public static void main(String[] args) {
	int arr[]= {2,5,3,83,2,5,5};
	frequencyCount(arr);
	
	
}
public static void frequencyCount(int arr[]) {

System.out.println(Arrays.toString(arr));
boolean [] visited=new boolean[arr.length];
for(int i=0; i<visited.length; i++){
	visited[i]=false;
}

for(int i=0; i<arr.length; i++) {
	int count=1;  //once we start checking with first element count is 1
	if(visited[i]==true) { // if the item is already visited we continue to the other line without doing anything here
		
		continue;
	}
	//we took first element now we compare first element with other remaining elements
	for(int j=i+1; j<arr.length; j++) {
		if(arr[i]==arr[j]) { //if the element is found 
			visited[j]=true; //we make it true and add the counter value
			count=count+1;
		}
	}
	System.out.println((arr[i]+ "  : "+count)); //we print the frequency for that element
	
	
}


}

}
