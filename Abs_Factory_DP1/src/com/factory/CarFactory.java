package com.factory;

import com.factory.product.Car;
import com.factory.product.CarSpecification;

public interface CarFactory {
	
	public Car createCar();
	public CarSpecification createCarSpecification();
}

