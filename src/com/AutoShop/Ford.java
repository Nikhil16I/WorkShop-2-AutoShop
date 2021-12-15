package com.AutoShop;

public class Ford extends Car {
	
	int year;//Initializing Variable for Manufacturing Year
	int manufacturerdiscount;//Initializing Variable for Manufacturing Discount

	public Ford(int speed, double regularPrice, String color,int year,	int manufacturerdiscount){
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
		this.manufacturerdiscount=manufacturerdiscount;
		this.year=year;		
	}
    /* Method Created For Sale Price */
	public double getSalePrice() {
		/* Checking Condition According to Manufacturer Discount */
	return	regularPrice-((regularPrice*manufacturerdiscount/100));
		
	}
		

}
