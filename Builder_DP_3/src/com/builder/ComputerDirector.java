package com.builder;

public class ComputerDirector {
 
	public void build(ComputerBuilder computerBuilder) {
		computerBuilder.buildCPU();
		computerBuilder.buildRAM();
		computerBuilder.buildStorage();
	}
}
