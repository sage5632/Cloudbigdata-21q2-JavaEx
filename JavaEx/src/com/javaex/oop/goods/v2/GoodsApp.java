package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//notebook.name = "LG Gram";
		//notebook.price = 1500000;
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone");
		smartphone.setPrice(1000000);
		
		System.out.printf("%s, %d원%n",notebook.getName(),notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(),smartphone.getPrice());
		
		//System.out.printf("%s, %d원%n", notebook.name,notebook.price);
		//System.out.printf("%s, %d원%n", smartphone.name,smartphone.price);
				
				notebook.showInfo();
				smartphone.showInfo();

	}

}
