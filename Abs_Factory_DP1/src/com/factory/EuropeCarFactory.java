package com.factory;

import com.factory.product.Car;
import com.factory.product.CarSpecification;
import com.factory.product.EuropeSpecification;
import com.factory.product.HashBack;

public class EuropeCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new HashBack();
	}

	@Override
	public CarSpecification createCarSpecification() {
		return new EuropeSpecification();
	}

}
