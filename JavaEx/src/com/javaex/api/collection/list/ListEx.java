package com.javaex.api.collection.list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListEx {

	public static void main(String[] args) {
		// 선언
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();
		
		// 객체 추가
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println(lst);
		
		// 객체의 삽입(중간에 객체 삽입)
		lst.add(2, "C#"); // 2번 인덱스 위치에 C#을 추가
		
		lst.add("Java");
		System.out.println(lst);
		
		// 요소의 갯수 확인
		System.out.println("요소의 갯수:" + lst.size()); //capacity는 확인 x
		
		// 요소의 삭제
		lst.remove(2); // 인덱스를 이용한 삭제
		// 객체의 삭제 : 주어진 객체 값으로 삭제
		lst.remove("Python");
		System.out.println(lst);
		

	}

}
