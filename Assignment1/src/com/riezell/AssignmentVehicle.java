package com.riezell;

abstract class Vehicle {
	abstract void run();
	abstract void stop();

	public void fuel(int a) {
		System.out.println("Fuel method 1");

	}

	public void fuel(float f, String s) {
		System.out.println("Fuel  method 2");

	}

	public void fuel(char c, int b) {
		System.out.println("Fuel method 3");

	}

	int speed = 50;
	long distance = 250;

	public Vehicle() {
		System.out.println("Default constructor");
	}

	public Vehicle(int speed, long distance) {
		super();
		this.speed = speed;
		this.distance = distance;
	}

}

class TwoWheeler extends Vehicle {

	@Override
	void run() {
		System.out.println("Two wheeler run");

	}

	@Override
	void stop() {
		System.out.println("Two wheeler stopped");

	}

	public TwoWheeler() {

	}

	int speed = 100;
	long distance = 300;
	int nos_of_tyre = 2;

	public void display() {
		System.out.println("The speed of two wheeler vehicle is " + speed);
		System.out.println("The distance  of the two wheeler vehicle is " + distance);
		System.out.println("The number of tyre in a two wheeler is " + nos_of_tyre);
		System.out.println("The speed of the vechile is " + super.speed);
		System.out.println("The distance of the vehicle is " + super.distance);

	}
}

class ThreeWheeler extends Vehicle {

	@Override
	void run() {
		System.out.println("Three wheeler run");
	}

	@Override
	void stop() {
		System.out.println("Three wheeler stopped");
	}

	public ThreeWheeler() {

	}

	int speed = 150;
	long distance = 400;
	int nos_of_tyre = 3;

	public void display() {
		System.out.println("The speed of three wheeler vehicle is " + speed);
		System.out.println("The distance  of the three wheeler vehicle is " + distance);
		System.out.println("The number of tyre in a three wheeler is " + nos_of_tyre);
		System.out.println("The speed of the vechile is " + super.speed);
		System.out.println("The distance of the vehicle is " + super.distance);

	}

}

class FourWheeler extends Vehicle {

	@Override
	void run() {
		System.out.println("Four wheeler run");
	}

	@Override
	void stop() {
		System.out.println("Four wheeler stooped");

	}

	public FourWheeler() {

	}

	int speed = 145;
	long distance = 425;
	int nos_of_tyre = 4;

	public void display() {
		System.out.println("The speed of four wheeler vehicle is " + speed);
		System.out.println("The distance  of the four wheeler vehicle is " + distance);
		System.out.println("The number of tyre in a four wheeler is " + nos_of_tyre);
		System.out.println("The speed of the vechile is " + super.speed);
		System.out.println("The distance of the vehicle is " + super.distance);

	}

}

class EightWheeler extends Vehicle {

	@Override
	void run() {
		System.out.println("Eight wheeler run");

	}

	@Override
	void stop() {
		System.out.println("Eight wheeler stopped");

	}

	public EightWheeler() {

	}

	int speed = 120;
	long distance = 500;
	int nos_of_tyre = 8;

	public void display() {
		System.out.println("The speed of eight wheeler vehicle is " + speed);
		System.out.println("The distance  of eight wheeler vehicle is " + distance);
		System.out.println("The number of tyres in a eight wheeler is " + nos_of_tyre);
		System.out.println("The speed of the vechile is " + super.speed);
		System.out.println("The distance of the vehicle is " + super.distance);
	}

}

public class AssignmentVehicle {

	public static void main(String[] args) {

		System.out.println("===============(TWO WHEELER)====================");
		TwoWheeler tw = new TwoWheeler();
		tw.display();

		System.out.println("================(THREE WHEELER)==================");
		ThreeWheeler t3w = new ThreeWheeler();
		t3w.display();

		System.out.println("================(FOUR WHEELER)===================");
		FourWheeler fw = new FourWheeler();
		fw.display();

		System.out.println("=================(EIGHT WHEELER)=================");
		EightWheeler ew = new EightWheeler();
		ew.display();

	}

}
