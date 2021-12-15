package com.AutoShop;

/* Super Class Car */
public class Car {
	
// Initializing Attributes for A vehicle
	int speed;
	double regularPrice;
	public String color;

    public Car(int speed,double regularPrice, String color) {
    	super();
    	this.speed=speed;
    	this.color=color;
    	this.regularPrice=regularPrice;
    }
    /* Method Created For Sale Price */
    public double getSalePrice() {
    return regularPrice;
 }
}

