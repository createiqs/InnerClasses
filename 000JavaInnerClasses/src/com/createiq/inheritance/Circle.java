package com.createiq.inheritance;

public class Circle extends Shape {

	public Circle(String color) {
		super(color);
	}

	@Override
	public double area(double value) {
		double area= Math.PI*(value * value);
		return area;
	}

}

