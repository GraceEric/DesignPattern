package com.eric.java.patterns.decorator.first.coffeebar.decorator;


import com.eric.java.patterns.decorator.first.coffeebar.Drink;

public class Soy extends Decorator {

	public Soy(Drink Obj) {
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Soy");
		super.setPrice(1.5f);
	}

}

