package stringAssignments;

import java.util.Arrays;

public class allStringAssignments {
	static String rev="";
	public static void main(String[] args) {
		String str="subash Gautam";
		countVowels(str);
		reverse(str);
		splitString("subash gautam");
		splitString2("subash gautam is here" );
		frequencyChar("subash");
		replaceSpace(str, '@');
		replaceSpace2(str, '*');
		duplicateChar("subash agautam aay");
		swapStrings("Subash", "Gautam") ;
		characterAtIndex("Subash", 2);
		checkEquals("java", "JAVA");
		
		
	}
	
	//this counts the vowels in a string

	public static void countVowels(String string) {
		int count=0;
		string=string.toUpperCase();
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)=='A'||string.charAt(i)=='E'||
					string.charAt(i)=='I'||string.charAt(i)=='O'||string.charAt(i)=='U') {
				count++;
				
			}
			
		}
		System.out.println("total vowels "+count);
	}
	
	
	//this reverses the string
	public static void reverse(String str) {
	
	for (int i =str.length()-1; i >=0;i--) {
			rev+=str.charAt(i);
	}
	System.out.println(rev);
	}
	
	
	// this splits the string based on whitespace available and count the number of words
	
	public static void splitString(String str) {
		String []splitedArray=str.split(" ");
		System.out.println(" total words :" +splitedArray.length);
	}
	
	// this splits the string based on whitespace available and count the number of words
	
	public static void splitString2(String str) {
	int count=1;
	if(str.length()==0) {
		System.out.println("No words");
	}
	else {
	for(int i=0; i<str.length(); i++){
		if((str.charAt(i))==' ') {
			count++;	
		}
	}
	}
	System.out.println("count "+count);
	}
	
	
	//frequency of each character in an array
	
	public static void frequencyChar(String str) {
		int [] freq= new int[str.length()];  //create an array with the size same as the length of a string
		char stringArray[]=str.toCharArray(); //create char Array for the string
		 //use two loops one to hold the first char and other to compare the data that is being hold
	for (int i=0; i<str.length(); i++) {   
		freq[i]=1;  // if visits the first char the freq becomes one on that position
		for (int j = i+1; j< str.length(); j++) {	//start comparing the first char with other chars starting one index above the holding char position
			if(str.charAt(i)==str.charAt(j)) {
				
				freq[i]++;		//if char matches increase the frequency at the position 
				stringArray[j]=0; //as soon as found change the value of that char to 0 so that when compared again this can be ignored
			}
			
		}
		
	}
	for (int i=0; i <freq.length;i++) { // to pring the data
		if (stringArray[i]!=0) { // this is because of the char was found we changed it to 0 so that we could ignore it
			System.out.println(stringArray[i]+" "+freq[i]); //printing the data
		}
	}
	
	}
	
	//replace the spaces of a string with a specific character
	
	public static void replaceSpace(String str, char character) {
		//you can do this using replace method ; str.replace(' ' , character)
		String changedString=""; // we need this because string is immutable
		char []charArray=str.toCharArray();
		for (int i =0; i <str.length(); i++) {
			if (charArray[i]==' ') {
				charArray[i]=character;
			}
		}
		System.out.println(Arrays.toString(charArray));
		System.out.println("new string after adding " +character+ " : " +String.copyValueOf(charArray));
	}
	
	
	
	//second way using temporary string holder
	
	
	public static void replaceSpace2(String str, char character) {
		//you can do this using replace method ; str.replace(' ' , character)
		String changedString=""; // we need this because string is immutable
		char []charArray=str.toCharArray();
		for (int i =0; i <str.length(); i++) {
			
			if (charArray[i]==' ') {
				charArray[i]=character;
				
			}
			changedString+=charArray[i];
		}
		System.out.println(Arrays.toString(charArray));
		System.out.println("new string after adding " +character+ " : " +changedString);
	}
	
	
	//find duplicate character in String. This uses the same concept of frequency of characters
	
	public static void duplicateChar(String str) {
		char arr[]=new char[str.length()];
		char [] splittedString=str.toCharArray();
		int count=0;
		for (int i=0; i <str.length(); i++) {
			arr[i]=' ';
			for (int j=i+1; j<str.length(); j++) {
				if (splittedString[i]==splittedString[j]) {
					arr[i]=splittedString[i];
					splittedString[j]=1;
					count++;
				
				}
			}
			if(splittedString[i]!=1) {
			System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println();
	
		}
	
	
	//swap two string variables without using third or temp variable
	public static void swapStrings(String first, String second) {
		
	//we can use substring. this will help us break the string based on the length that we pass
		System.out.println("before swapping :  " + "first word: "+first + ", second  word :"+ second);
		
		first= first + second;

		second=first.substring(0,first.length()-second.length());
		
		first=first.substring(second.length(),first.length());
		
		System.out.println("after swapping :  " +"first word : "+  first + ", second word: "+ second);
		
		
	}
	
	public static void characterAtIndex(String str, int index) {
		char stringToArray[]=str.toCharArray();
		System.out.println("character at index "+index+" is " +stringToArray[index]);
		
	}
	
	public static void checkEquals(String st1, String st2) {
		
		if(st1.length()!=st2.length()) {
			System.out.println("They are not equal ");
		}
		else {
			char first[]=st1.toCharArray();
			char second[]=st2.toCharArray();
			boolean flag=true;
		for(int i=0; i < first.length; i++) {
			if (first[i]!=second[i]) {
				
				flag=false;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println(st1+ " and "+st2+" are equal");
		}else {
			System.out.println(st1+ " and  "+st2+" are not equal.");
		}
		
	}
	}
	
	
}
