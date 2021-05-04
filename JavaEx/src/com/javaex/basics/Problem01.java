package com.javaex.basics;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		 problem10(); // 1번문제 배열데이터 3의배수 3의배수합
		// problem2(); // 2번문제 평균 구하는 프로그램
		// problem3(); // 3번문제 공백에 콤마삽입
		// problem4(); // 4번문제 미니로또
		// problem5(); // 2차원 배열 내 80점이상 합계와 평균

	}

	private static void problem10() {
		int[] data = { 1,3,5,8,9,11,15,18,19,20,30,31,33 };	
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < data.length; i++) {
			if(data[i] % 3 == 0) {
			sum += data[i];
			count++;
			
		}
		
	}
		System.out.println("주어진 배열에서 3의 배수의 합 =>" + sum);
		System.out.println("주어진 배열에서 3의 배수의 개수 =>" + count );
	}
	private static void problem2() {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		float sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			sum = sum + num[i];
		}
		System.out.println("평균은" + (sum / num.length + "입니다"));
	}

	private static void problem3() {
		// System.out.println("This is a pencil");
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };
		String d = "This is a pencil";
		String text = d.replace(' ', ',');
		System.out.println(d);

	}

	private static void problem4() {
		int lotto[] = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

	private static void problem5() {
		int scoreboard[][] = { { 80, 75, 90, 95, 78 }, { 92, 88, 89, 92, 70 }, { 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 }, { 89, 83, 93, 94, 78 } };
		// 배열내에서 85점 점수만 뽑아 총합과 평균값.
		int sum = 0;
		double avg = 0.0;
		int count = 0;

		for (int i = 0; i < scoreboard.length; i++) {
			for (int j = 0; j < scoreboard[i].length; j++) {
				if (scoreboard[i][j] >= 80) {
					sum += scoreboard[i][j];
					count++;
				}

			}
			avg = sum / count;
			
		}
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
	}
	}
	

