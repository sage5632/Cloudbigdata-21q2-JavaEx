package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// 호출 순서
		//	두번째부터는static은 호출안됨
		StaticEx s1 = new StaticEx();
		System.out.println("참조 카운트" + StaticEx.refCount);
		// Static 멤버는 객체 생성(new) 없어도 접근할 수 있다
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트 " + StaticEx.refCount);
		
		// 참조 해제
		s1 = null;
		System.out.println("s1 해제!");
		System.out.println("참조 카운트:" + StaticEx.refCount);
		// 강제로 GC 호출
		System.gc();
		try {
			Thread.sleep(3000); // 3초 대기
			System.out.println("참조 카운트 : " + StaticEx.refCount);
		} catch (Exception e) {
		}
	}

}