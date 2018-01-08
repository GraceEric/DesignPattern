package com.eric.java.patterns.decorator.first.coffeebar.decorator;


import com.eric.java.patterns.decorator.first.coffeebar.Drink;

public  class Decorator extends Drink {

	private Drink Obj;

	public Decorator(Drink Obj){
		this.Obj=Obj;
	};
	
	
	@Override
	public float cost() {

		return super.getPrice()+Obj.cost();
	}

	@Override
	public String getDescription()
	{
		return super.description + "-"+super.getPrice()+"&&"+Obj.getDescription();
	}
	
	}
