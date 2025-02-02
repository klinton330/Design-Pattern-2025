package com.builder;

public class Client {
	public static void main(String[] args) {
		ComputerBuilder computerBuilder = new GamingComputerBuilder();
		ComputerDirector computerDirector = new ComputerDirector();
		computerDirector.build(computerBuilder);
		Computer computer = computerBuilder.getResult();
		System.out.println(computer);
	}
}
