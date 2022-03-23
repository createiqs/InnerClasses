package com.createiq.inheritance;

public abstract class Shape {

	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public abstract double area(double value);

	public String getColor() {
		return color;
	}
}
