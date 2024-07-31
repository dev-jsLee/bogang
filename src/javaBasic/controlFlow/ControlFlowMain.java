package javaBasic.controlFlow;

import java.util.Scanner;

public class ControlFlowMain {

	public static void main(String[] args) {
		// 제어문
		// 조건문
		// 조건에 따라 실행할지 여부를 결정하는 if문
		// if(조건식) -> 조건식=> 반환값이 true|false
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		int inputNum = sc.nextInt();
		
		// 점수가 90점 이상이면 A
		// 80이상 B
		if(inputNum >= 80 && inputNum < 90) {
			System.out.println("B");
		} else if(inputNum >= 90) {
			System.out.println("A");
		} else {
			System.out.println("F");
		}
		
		// 성적에 따라 부여될 문자(A~F)가 담길 변수다.
		String scoreChar = "";
		// 100 >= A >= 90
		// 90 > B >= 80
		// 80 > C >= 70
		// 70 > F
		
		// 성적의 범위에 따라
		// 부여될 문자를 scoreChar 담아서
		// if문 끝났을 때
		// 출력은 한번만 한다.
		
		
		
		
		// switch문
		// 주어진 변수의 값에 따라 실행할 위치를 바꾸는 switch
		// switch(변수){
		// 		case 상수:
		// 			변수의 값이 상수일 때 실행할 내용
		//			break; // -> 아래의 실행문은 실행되지 않고
		//					switch문을 탈출한다.
		//	}
		int number = 3;
		switch(number) {
		case 0:
			System.out.println(number + "는 0이다.");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println(number + "는 3 이하다.");
			break;
		default:
			System.out.println("이 숫자는 3 이하가 아니다.");
		}
		
		
		// 문제2. 등급에 따라 혜택을 부여하는 스위치문 예제. 
		// 더 높은 등급은 아래 등급의 혜택도 가져간다.
		// 단, 무료 등급의 혜택은 상위 등급의 혜택에는 포함되지 않는다.
		System.out.println("======================");
		System.out.print("등급 입력(1~3)>>");
		// 골드 등급은 1, 실버는 2, 브론즈 3이라는 값으로 확인한다.
		int checkTier = sc.nextInt();
		
		// 골드 등급은 30일 무제한 음악 듣기
		// 실버 등급은 300개 곡 다운로드
		// 브론즈 등급은 30회 듣기
		// (1, 2, 3이 아닌 숫자)무료 등급은 1분 무료듣기 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
