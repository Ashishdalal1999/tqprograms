package com.thread;


interface Speedable {
	public void changeSpeed(int speed);

	default void start(String obj) {
		System.out.println(obj + ":Started......");
	}

}

public class LambdaWithPara {

	public static void main(String[] args) {
		//
		Speedable car = speed -> {
			System.out.println("car has increased by " + speed + "km/hr");
		};

		car.start("car");
		car.changeSpeed(30);

		Speedable bike = (speed) -> {
			System.out.println("bike has increased by " + speed + "km/hr");
		};

		bike.start("bike");
		bike.changeSpeed(20);

	}

}