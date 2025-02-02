package com.builder;

public interface ComputerBuilder {
	
	public void buildCPU();
	public void buildRAM();
	public void buildStorage();
	public Computer getResult();

}
