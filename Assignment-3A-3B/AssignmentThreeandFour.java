package assignment3adn4;

import javax.sound.midi.Soundbank;

/*
 * even or not
 * odd or not
 * leap year or not
 * print even numbers 1 to 100
 * print prime numbers 1 to 100
 * print fibonacci series
 * print palindrome
 * factorial
 * armstonumber
 * 
 */
public class AssignmentThreeandFour {
	//main method
	public static void main(String[] args) {
//		leapYear(2012);
//		seriesOdd(10);
		//FibonacciSeries(2);
		//primeSeries(15);
		//System.out.println(checkPalindrome(0));
		
		//System.out.println(fact(8));
		System.out.println(checkArmstrong(153));
	}
	
	//check if the number is evenOrnot
public static void evenOrnot(int num) {
	if (num%2==0) {
		System.out.println("even");
		
	}
	else {
		System.out.println("Not even");
	}
}

//checks if the number is odd number or not
public static void OddOrNot(int num) {
	if(num%2==1) {
		System.out.println("Odd");
	}
	else {
		System.out.println("not odd");
	}
}

//check if the given year is leap year or not
public static void leapYear(int year) {
	if(year %4==0) {
		if (year %100 ==0) {
			if (year % 400 == 0) {
				System.out.println("it is leap year");
			}
			else {
				System.out.println("not leap year");
			}
		}
		else {
			System.out.println("this is leap year");
		}
	}
	else {
		System.out.println("this is not a leap year");
	}
}

//print even number series up to given point 
public static void seriesEven(int number) {
	System.out.println("series of even");
	for (int i =0; i <= number; i++) {
		if (i%2 ==0){
		System.out.println(i);	
		}
	}
}

//print odd number series upto given point
public static void seriesOdd(int number) {
	System.out.println("series of odd");
	for (int i =0; i <= number; i++) {
	
		if (i%2 ==1){
		System.out.println(i);	
		}
	}
}

//print prime numbers upto given point

public static void primeSeries(int number) {
	boolean prime;
	if (number==0 || number ==1) {
		System.out.println("neither prime nor composite");

	}
	else {
		for (int i=2; i<number; i++) {
			prime=true;
			for(int j=2; j<i; j++) {
			if (i%j==0) {
				prime=false;
				break;	
			}
		}
			if(prime==true) {
				System.out.println(i);
			}
		
	}
		
	}
}

// print fibonacci series upto given point

public static void FibonacciSeries(int finalPosition) {
	int first=0;
	int second=1;
	if (finalPosition==0) {
		System.out.println(0);
	}
	else {
	for (int i=1; i <=finalPosition; i++) {
		int sum=first+second;
		first=second;
		second=sum;
		System.out.println(first);
	}
	}
}


//checks if the number is palindrome or not
public static boolean checkPalindrome(int number) {
	int sum=0;
	int nu;
	int temp=number;
	
	while(number>0) {
	 nu=number%10;
	sum=sum*10+nu;
	number=number/10;
	
	
	
	}
	System.out.println(temp);
	if(temp==sum) {
		return true;
	}
	return false;

}

//find the factorial of a number
public static int fact(int number) {
	int fact=1;
	if(number==0 || number==1) {
		return 1;

	}
	while(number>1) {
		fact=fact*number;
		number=number-1;
	}
	return fact;
}

//check if the given number is armstrong or not
public static boolean checkArmstrong(int number) {
	int temp=number;
	int cubicSum=0;
	int remainder=0;
	while(number>=1) {
		remainder=number%10;
		cubicSum=cubicSum+(int)Math.pow(remainder, 3);
		number=number/10;
	}
	if (cubicSum==temp) {
		return true;
	}
	return false;
}

}
