package com.eric.java.patterns.decorator.first.coffeebar.decorator;


import com.eric.java.patterns.decorator.first.coffeebar.Drink;

public class Milk extends Decorator {

	public Milk(Drink Obj) {
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}

