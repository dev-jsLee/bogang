package javaBasic.controlFlow;

import java.util.Scanner;

public class WhileMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 무한히 반복 실행하되 조건에 따라 탈출하는 while문
//		int i = 0;
//		while(true) {
//			System.out.println("반복" + i);
//			if(i >= 9) {
//				System.out.println("탈출");
//				break;
//			}
//			i++;
//		}
		
//		int inputNum1 = sc.nextInt();
		
//		while(inputNum1 < 10) {
//			
//		}
		int count = 0;
		do {
			System.out.println(count);
		    count += 1;
		} while(count < 3);
		
		
		
		
		
		

	}

}
