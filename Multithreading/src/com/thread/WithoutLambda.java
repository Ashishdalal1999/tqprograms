package com.thread;

interface Movable {
	public void move();

	default void changeSpeed() {
		System.out.println("Speed Increased");
	}

}

public class WithoutLambda {

	public static void main(String[] args) {
		Movable ball = new Movable() {

			@Override
			public void move() {
				System.out.println("Ball is rolling at the speed of 10km/hr");

			}

		};

		ball.move();
		Movable car = new Movable() {

			@Override
			public void move() {
				System.out.println("car is moving at the speed of 60km/hr");

			}

		};

		car.move();

	}
}
