package com.apjfsa;

public class Airoplane implements Airways {

	@Override
	public void takeoff() {
		System.out.println("The Airoplane is taking off");
		
	}

	@Override
	public void land() {
		System.out.println("the Airoplane is landing");
		
	}
	public static void main(String[] args) {
		Airways air=new Airoplane();
		air.takeoff();
		air.land();
		
		Airways h=new Helicopter();
		h.takeoff();
		h.land();
		
	}

}
