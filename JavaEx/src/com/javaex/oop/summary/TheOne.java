package com.javaex.oop.summary;

public class TheOne extends Human implements KungfuSkill, Flyable {
	public TheOne(String name, int age) {
		super(name, age);
	}
	
	
	@Override
	public void fly() {
		System.out.printf("%S: I believe I can fly!%n", name);

	}

	@Override
	public void kungfu() {
		System.out.printf("%s: I know kungfu!%n",  name);

	}

}
