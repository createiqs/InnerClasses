package com.createiq.innerclasses;

public class Pizza {

	private String pizzaName;
	private String pizzaType;
//	private double price;
	private PricePizzas price;

	public Pizza(String pizzaName, String pizzaType, PricePizzas price) {

		this.pizzaName = pizzaName;
		this.pizzaType = pizzaType;
		this.price = price;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	// constants how to express programettically
	// small, medium and large
	public static void main(String[] args) {
		Pizza pizzaOne = new Pizza("MixicanSalad", PizzaTypes.SMALL, PricePizzas.SMALL);
		System.out.println(
				pizzaOne.getPizzaName() + "\n" + pizzaOne.getPizzaType() + "\n" + PricePizzas.SMALL.getPrice());
	}

}
