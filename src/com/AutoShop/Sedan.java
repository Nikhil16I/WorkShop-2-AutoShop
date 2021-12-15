package com.AutoShop;

public class Sedan extends Car {
	int length;//Initializing Variable for Vehicles Length

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
	}
	
    /* Method Created For Sale Price */
	public double getSalePrice() {
		/* Checking Condition According to Weight */
		if (length == 20)
			return regularPrice - ((regularPrice * 5) / 100);
		else
			return regularPrice - ((regularPrice * 10) / 100);
	}

}
