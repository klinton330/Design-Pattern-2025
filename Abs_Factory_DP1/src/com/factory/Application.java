package com.factory;

import com.factory.product.Car;
import com.factory.product.CarSpecification;

public class Application {

	CarFactory carFactory;
	Car car;
	CarSpecification carSpecification;

	public Application(CarFactory carFactory) {
		this.carFactory = carFactory;
		this.car=carFactory.createCar();
		this.carSpecification=carFactory.createCarSpecification();
	}

	public void initiate() {
		car.assumble();
		carSpecification.display();
	}

}
