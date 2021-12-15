package com.AutoShop;

public class Truck extends Car {
	int Weight;//Variable Initialize for Weight

	public Truck(int speed, double regularPrice, String color, int Weight) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
		this.Weight = Weight;
	}
	
    /* Method Created For Sale Price */
	public double getSalePrice() {
		/* Checking Condition According to Weight */
		if (Weight > 2000)
			return regularPrice - ((regularPrice * 10) / 100);// For 10% Discount
		else
			return regularPrice - ((regularPrice * 20) / 100);// For 20% discount

	}
}
