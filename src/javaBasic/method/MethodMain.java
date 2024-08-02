package javaBasic.method;

public class MethodMain {

	public static void main(String[] args) {
		// 메서드
		// 기능을 미리 만들어두고 부품처럼 가져다 쓸 수 있게
		// 정의해 놓은 기능블록 단위
		
		
		addStr(getName(), "20살");
//		System.out.println(getName());
	}
	
	public static void printSomething() {
		System.out.println("출력하기 하는 메서드");
	}
	
//	숫자 두 개를 받아서 더한 뒤 그 숫자를 내보낸다.
	public static int plus(int num1, int num2) {
		int 반환값 = 0;
		반환값 = num1 + num2;
		return 반환값;
	}
	
	// 두 개의 문자열을 받아서 정해진 포맷대로 출력한다.
	public static void addStr(String name, String age) {
		String concatText = "";
		concatText = "이름은 " + name + ", 나이는 " + age;
		System.out.println(concatText);
		return;
	}
	
	public static String getName() {
		String name = "홍길동";
		return name;
	}
	
	
	// 숫자 하나를 입력받아서, 0부터 해당 숫자까지 반복해서 출력하는 프로그램
	public static void printToLength(int length) {
		// length가 양수
		for (int i = 0; i < length; i++) {
			System.out.println(i);
		}
	}
	
	
	// 문자열 두 개를 받아서 정해놓은 포맷대로 리턴
	public static String getConcatStr(String name, String age) {
		String result = "";
		
		
		
		
		
		
		return result;
	}
	
	

}




