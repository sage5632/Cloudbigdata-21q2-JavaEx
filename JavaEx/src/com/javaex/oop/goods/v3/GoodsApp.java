package com.javaex.oop.goods.v3;


public class GoodsApp {

	public static void main(String[] args) {
		// 생성자를 이용한 객체의 초기화
		Goods notebook = new Goods("LG Gram", 1500000);
		
		Good smartphone = new Goods("iPhone", 1000000);
		
		System.out.printf("%s, %d원%n",notebook.getName(),notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(),smartphone.getPrice());
		
		//System.out.printf("%s, %d원%n", notebook.name,notebook.price);
		//System.out.printf("%s, %d원%n", smartphone.name,smartphone.price);
		
		// price, name 필드는 읽기 전용 필드 데이터를 변경할 수 없다
//		notebook.setPrice(15000);
//		smartphone.setPrice(10000);
		
				notebook.showInfo();
				smartphone.showInfo();

	}

}
