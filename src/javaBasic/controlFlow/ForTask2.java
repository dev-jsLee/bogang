package javaBasic.controlFlow;

public class ForTask2 {

	public static void main(String[] args) {
		// for문
		// 몇번을 반복할지 알거나
		// 반복할 횟수를 정해놓고 코드를 반복할 때 쓴다.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		// 0부터 99까지 2씩 증가하는 등차수열을 출력
//		for (int i = 0; i < 100; i+=2) {
//			System.out.println(i);
//		}
		for (int i = 0; i < 100; i++) {
			if(i%2==0) { // 짝수이면
				System.out.println(i);
			}
		}
		
		
		
		
		
		
	}

}
