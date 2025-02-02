package com.factory;

import com.factory.product.Car;
import com.factory.product.CarSpecification;
import com.factory.product.NorthAmericaSpecification;
import com.factory.product.Sedan;

public class NorthAmericaCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Sedan();
	}

	@Override
	public CarSpecification createCarSpecification() {
		return new NorthAmericaSpecification();
	}
}
