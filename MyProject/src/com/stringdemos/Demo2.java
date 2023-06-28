package com.stringdemos;

class Animal
{
	void sound()
	{
		System.out.println("voice");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.println("meowing");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		Cat c=new Cat();
		d.bark();
		d.sound();
		c.meow();
		c.sound();
		
	}

}
