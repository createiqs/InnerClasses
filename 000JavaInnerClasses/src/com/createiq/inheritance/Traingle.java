package com.createiq.inheritance;

public abstract class Traingle extends Shape {
	private int height;
	private int base;

	public Traingle(String color, int height, int base) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public double area(double value) {
		return 0;
	}

	public double area(int height, int base) {
		double area = base * height / 2;
		return area;
	}

	public int getHeight() {
		return this.height;
	}

	public int getBase() {
		return base;
	}

}
