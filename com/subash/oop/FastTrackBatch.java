package com.subash.oop;

public class FastTrackBatch extends Student{

	@Override
	double calculateFee(String courseName) {
		if(courseName.equals("Java")) {
			return 7000;
		}
		if (courseName.equals("Python")) {
			return 5000;
		} return 3000;
		
	}
	

}
