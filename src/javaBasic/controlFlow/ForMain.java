package javaBasic.controlFlow;

import java.util.Scanner;

public class ForMain {

	public static void main(String[] args) {
		// 반복문
		// 일정 횟수만큼 반복해서 실행하는 for문
		// 
		// 모든 문제의 숫자는 정상적으로 입력받는다고 가정한다.
		
		Scanner sc = new Scanner(System.in);
		// 문제3. 1부터 9까지 중 하나의 수를 입력받고
		// 그 값을 length 변수에 담은 뒤
		System.out.print("입력>>");
//		int length = sc.nextInt(); // 7
		int length = 7;
		// i=0; i<length; i++;을 조건으로 하는 for문으로
		for (int i = 0; i < length; i++) {
			// 1부터 length까지 출력하는 프로그램 작성
			System.out.println(i+1);
		}
		
		// 문제4. 1부터 9까지 중 하나의 수를 받아서
		// 그 값을 gugudan1 변수에 담은 뒤
		int gugudan1 = 7;
		// 해당 숫자에 해당하는 구구단 출력하는 프로그램 작성
		for (int i = 0; i < 9; i++) {
//			System.out.println(
//					gugudan1 + " x " + (i+1) + " = " + gugudan1*(i+1));
			System.out.printf("%d x %d = %d", gugudan1, i+1, gugudan1 * (i+1));
		}
		// printf로 서식 출력 혹은
		// println으로 String연결을 통한 내용 합치기로 출력
		// 3 입력 시
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ... 
		// 3 x 9 = 27
		
		// 문제5. 2부터 9까지 중 하나의 수를 받아서
		// 그 값을 gugudan2 변수에 담은 뒤
		// 2단부터 gugudan2까지 구구단을 출력하는 프로그램 작성
		// 힌트: 이중 for문
		// 4 입력 시
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 2 x 9 = 18
		// 3 x 1 = 3
		// ...
		// 3 x 9 = 27
		// 4 x 1 = 4
		// ...
		// 4 x 9 = 36
		
		// 문제6. 2~9까지의 두 개의 수를 입력받은 뒤
		// 각각 num1, num2에 담은 뒤
		// 큰 수와 작은 수를 구분하여
		// 큰 수는 big 변수에 담고
		// 작은 수는 small 변수에 담아
		// 작은 수부터 큰 수까지의 구구단을 출력하는 프로그램 작성
		// 5 3
		// 3 x 1 = 3
		// ...
		// 5 x 9 = 45
		
		
		

	}

}
