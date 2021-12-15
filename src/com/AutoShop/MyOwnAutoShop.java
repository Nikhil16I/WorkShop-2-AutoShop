package com.AutoShop;

public class MyOwnAutoShop {

	public static void main(String[] args) {
        /*For Cars*/
		Car Fortuner = new Car(120, 3070000, "black");
		System.out.println("Cars-> Current Sale Price For Fortuner is - Rs." + Fortuner.getSalePrice());//Showing Sale Price for Automobile
		System.out.println(" Specification  Colour-"+Fortuner.color+"\n");//Showing Other Features

		/*For Sedan Cars*/ 
		Sedan VolkswagenVento = new Sedan(155, 999999, "Black", 5);
		System.out.println("Sedan Cars-> Current Sale Price For Vento is - Rs." + VolkswagenVento.getSalePrice());//Showing Sale Price for Automobile
		System.out.println(" Specification  Colour-"+VolkswagenVento.color+"\n");//Showing Other Features 

		
		/*  For Ford Cars */
		Ford Endavour = new Ford(165, 3810000, "Smoke Grey", 2021, 12);
		System.out.println("Ford Cars-> Current Sale Price For Endavour is - Rs." + Endavour.getSalePrice());//Showing Sale Price for Automobile
		System.out.println(" Specification  Colour-"+Endavour.color+"  Model Year-"+Endavour.year+"\n");//Showing Other Features

		Ford Figo = new Ford(150, 630000, "White", 2017, 7);
		System.out.println("Ford Cars-> Current Sale Price for Figo is - Rs." + Figo.getSalePrice());//Showing Sale Price for Automobile
		System.out.println(" Specification  Colour-"+Figo.color+"  Model Year-"+Figo.year+"\n");//Showing Other Features

		/* For Trucks */
		Truck ToyotaTundra = new Truck(130, 2600000, "Metallic Grey", 2550);
		System.out.println("Trucks -> Current Sale Price for Toyota Tundra  is - Rs." + ToyotaTundra.getSalePrice());//Showing Sale Price for Automobile
		System.out.println(" Specification  Colour-"+ToyotaTundra.color+"\n");//Showing Other Features

	}

}
