package com.javaex.oop.goods.v2;

// v2. 필드(데이터)
public class Goods {
	// 필드
	private String name;
	private int price;

	// Getter/Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
}
