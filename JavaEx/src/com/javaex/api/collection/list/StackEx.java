package com.javaex.api.collection.list;

import java.util.Stack;
public class StackEx {

	public static void main(String[] args) {
		// Stack 선언
		Stack<Integer> stack = new Stack<>();
		
		// 10개 데이터를 입력
		for (int i = 1; i <=10; i++) {
			// 스택에 데이터 입력 : push
			stack.push(i);
			System.out.println("PUSH:" + stack);
		}
		// 가장 위의 데이터 확인 : peek -> 삭제 하지않음
			System.out.println("PEEK:" + stack.peek());
			System.out.println("Stack : " + stack);
			
			// 데이터의 인출 : pop -> 값을 삭제
			System.out.println("POP:" + stack.pop());
			System.out.println("Stack:" + stack);
			
			while(!stack.empty()) { // 스택이 비어있지 않으면 실행
				System.out.println("POP:" + stack.pop());
				System.out.println("Stack:" + stack);
			}
			
		}

	}



