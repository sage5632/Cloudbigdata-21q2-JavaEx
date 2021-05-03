package com.javaex.basics;
import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
	//ifElseEx();
	//ifElseEx2();
	//ifElseEx3();
	//switchEx();
	//switchEx2();
	switchEx3();
	}
	
	private static void switchEx3() {
		// 코드 값을 문자열로 전달하는 경우
		// -> 오타 발생 가능, 원하지 않는 입력이 넘어오는 경우가 있다
		// 코드의 집합을 별도 선언, 입력 값을 제한해야 한다
		// -> TODO : enum 열거형으로 재작성을 해볼것
		String day = "SUNDAY";
		String act = "";
		
		// MONDAY ~ THURSDAY : act <- 열공
		// FRIDAY : 불금
		// SATURDAY : act <- 주말
		// SUNDAY : act <- 휴식
		// 나머지 : act <- ?
		switch (day) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURDAY":
			act = "열공";
			break;
		case "FRIDAY":
			act = "불금";
			break;
		case "SATURDAY":
			act = "주말";
				break;
		case "SUNDAY":
			act = "휴식";
				break;
				default:
					act = "?";
		}
		System.out.println(day + "에는" + act);
	}
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = scanner.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일입니다.");
			break;
		case 2:
			System.out.println("28일입니다.");
			break;
			default:
			System.out.println("?");
			}
		scanner.close();
	}
	private static void switchEx() {
		// ifElseEx3를 Switch 문으로 만들어 봅시다
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 1. Java, 2. C, 3. C++ 4. 파이썬");
		int subject = scanner.nextInt();
		
		//switch ~ case  문으로 구현
		// 특별한 경우가 아니면 case문과 break문은 쌍으로 생각
		switch(subject) {
		case 1: // subject ==1
			System.out.println("R101");
			break;
		case 2: // subject == 2
			System.out.println("R202");
			break;
		case 3: // subject == 3
			System.out.println("R303");
			break;
		case 4: // subject = 4
			break;
		default: // else 문 -> 위에 일치하는 값이 없을 때 수행
			System.out.println("관리자에게 문의하세요");
			
		}
		
		scanner.close();
	}
	private static void ifElseEx3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 1. Java, 2. C, 3. C++ 4. 파이썬 5.이클립스");
		int subject = scanner.nextInt();
		
		
		if (subject == 1) {
			System.out.println("R101호 입니다");
		} else if (subject == 2) {
			System.out.println("R202호 입니다");
		} else if (subject == 3) {
			System.out.println("R303호 입니다");
		} else if (subject == 4) {
			System.out.println("R404호 입니다");
		} else if (subject == 5) {
			System.out.println("R505호 입니다");
		} else {
			System.out.println("상담원에게 문의하세요");
		
		}
		scanner.close();
	}
	private static void ifElseEx2() {
		// 정수 입력
		// 양수일 때
		//	짝수, 홀수
		// 음수일 때 -> 음수
		// 0이면 0
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int num = scanner.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
			// 양수
		} else {
			if (num == 0) {
				System.out.println("0입니다");
			} else {
				System.out.println("음수입니다.");
			
			}
			// 음수 or 0
		
		}
		scanner.close();
		
	}
	private static void ifElseEx() {
		// 정수를 입력 받아서
		// 양수, 음수, 0을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
				
		int num = scanner.nextInt();
	/*	
		if (num >0) {
			System.out.println("양수입니다");
		} else if (num < 0) {
			System.out.println("음수입니다");
	} else {
			System.out.println("0입니다");
		}
		*/
				if (num == 0) {
			System.out.println("0입니다.");
		} else {
			if (num > 0) {
				//양수
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		//scanner.close();
	}
}
