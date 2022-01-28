
package ArrayAssignments;
import java.util.ArrayList;

public class common_element_string_array {
public static void main(String[] args) {
	String arr1[]= {"ab", "cs","eed","asd","asdasd","asdasdadasd"};
	String arr2[]= {"asdasd","cd","cs","ab"};
	System.out.println(commonElement(arr1,arr2));
}

public static ArrayList commonElement(String [] arr1, String [] arr2) {
	ArrayList commonlist=new ArrayList();
	for (int i=0; i <arr1.length; i++) {
		for (int j=0; j<arr2.length;j++) {
			if(arr1[i].equals(arr2[j])){
				commonlist.add(arr1[i]);
			}
		}
	}
	return commonlist;
	
}
}
