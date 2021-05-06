package com.javaex.oop.goods.v4;

//v4 . this : 객체 자신을 지칭
// this() : 객체 자신의 다른 생성자를 지칭할 떄 사용

public class Goods {
	// 필드
	private String name;
	private int price;
	
	//생성자
	public Goods(String name) {
		this.name = name;
	}
	public Goods(String name, int price) {
		// 클래스 내부의 다른 생성자를 호출할 때는 this()로 호출한다.
		this(name);
		this.price = price;
	}

	// Getter/Setter
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
}