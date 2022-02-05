package com.subash.oop;

public class studentClient {
	public static void main(String[] args) {
		FastTrackBatch ft=new FastTrackBatch();
		ft.setCourse("Python");
		ft.setSname("subash");
		double fee=ft.calculateFee(ft.getCourse());
		System.out.println(fee);
	}

}
