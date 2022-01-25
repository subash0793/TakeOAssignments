package assignment24Jan;

import java.util.Scanner;

public class question1to5 {
	public static void main(String[] args) {
		FahrenheitToCelcius(98.6);
		inchesTometer(1);
		totalDigitSum(1001);
		minToyearDays(3456789);
		 CurrentTime(256);
		 BMI(180,66);
		 speedFormula();
		 
	}
	public static void FahrenheitToCelcius(double Fahrenheit) {
		double celcius=((Fahrenheit-32)*5)/9;
		System.out.println("Fahrenheit to Celcius " +celcius);
	}
	public static void inchesTometer(double inches) {
		
		System.out.println(" Inches to meters : "+inches * 0.0254);
	}
	
	public static void totalDigitSum(int num) {
		int temp=num;
		int rem=0;
		int sum=0;
		
		if(num>=0 && num<=1000) {
			while(num>=0) {
				
				rem=num%10;
				sum=sum+rem;
				num=num/10;	
		
			}
			
			System.out.println("total sum of digits :" +sum);
			
		}else {
			System.out.println(" this is invalid number use number between 0 and 1000");
			
		}
		
	}
	public static void minToyearDays(int min) {
		int totaldays=(min/60/24)%365;
		int years=(min/(60*24*365));
		System.out.println("Year "+ years+ " days "+totaldays);
		
	}
	public static void CurrentTime(int timeOffset) {
		double milli=System.currentTimeMillis();
		double seconds=milli/1000;
		double runningSecond=seconds%60;
		double minutes=seconds/60;
		double runningMinute=minutes%60;
		double hrs=minutes/60;
		double runninghrs=(hrs+timeOffset)%24;
		System.out.println("hrs: "+(int)runninghrs+" minutes: "+(int)runningMinute+ " seconds: "+(int)runningSecond) ;
		
	}
	public static void BMI(double weight, double height) {
		double BMI= (weight/(height*height))*703;
		System.out.println("total BMI "+BMI);
	}
	public static void speedFormula() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the distance in meters");
		int distance=scan.nextInt();
		System.out.println("enter the hours");
		int hours=scan.nextInt();
		System.out.println("enter the minutes");
		int min=scan.nextInt();
		System.out.println("enter the seconds");
		int sec=scan.nextInt();
		double hrstosec=hours*60*60;
		double mintosec=min*60;
		double meterPerSec=distance/(hrstosec+mintosec+sec) ;
		System.out.println(distance+ " "+hours );
		System.out.println("meter per second : "+meterPerSec);
		double kmperhr =(distance*0.001)/hours;
		System.out.println("km per hr "+ kmperhr);
		double milesPerHr= (distance*0.00062)/hours;
		System.out.println("miles per hr "+milesPerHr);
		//double meterPerMin=distance/(h)
	}
	
}
