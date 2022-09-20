package com.testleaf.sample_program;

public class Car {
	public void driveCar() {
		System.out.println("Car Running Successfully");
	}
	public void applyBreak() {
		System.out.println("Put the Break");
	}
	public void soundHorn() {
		System.out.println("Press the Horn");
	}
	public void isPuncture() {
		System.out.println("My car is not a Puncture");
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.driveCar();
		car.applyBreak();
		car.soundHorn();
		car.isPuncture();
	}
}