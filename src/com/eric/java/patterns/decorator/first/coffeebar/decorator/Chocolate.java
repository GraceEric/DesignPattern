package com.eric.java.patterns.decorator.first.coffeebar.decorator;


import com.eric.java.patterns.decorator.first.coffeebar.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
