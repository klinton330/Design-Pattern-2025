package com.builder;

public class GamingComputerBuilder implements ComputerBuilder {

	Computer computer = new Computer();

	@Override
	public void buildCPU() {
		computer.setCpu("32GB");

	}

	@Override
	public void buildRAM() {
		computer.setRam("8GB");
	}

	@Override
	public void buildStorage() {
		computer.setStorage("1TB");

	}

	@Override
	public Computer getResult() {
		return computer;
	}

}
