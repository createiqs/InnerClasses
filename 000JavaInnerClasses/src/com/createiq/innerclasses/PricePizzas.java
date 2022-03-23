package com.createiq.innerclasses;

public enum PricePizzas {

	SMALL(125.00), LARGE(565.00), MEDIUM(250.00);

	private double price;

	PricePizzas(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

}
