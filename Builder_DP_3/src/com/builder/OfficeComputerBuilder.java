package com.builder;

public class OfficeComputerBuilder implements ComputerBuilder {

	Computer computer=new Computer();
	@Override
	public void buildCPU() {
		computer.setCpu("8GB");

	}

	@Override
	public void buildRAM() {
		computer.setRam("4GB");
	}

	@Override
	public void buildStorage() {
		computer.setStorage("576 GB");

	}

	@Override
	public Computer getResult() {
		return computer;
	}


}
