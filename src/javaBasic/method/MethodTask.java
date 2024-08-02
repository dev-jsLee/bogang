package javaBasic.method;

public class MethodTask {

	public static void main(String[] args) {
		printNums(100);
		
		// 배열
		// 여러 개의 값을 가지는 값의 덩어리다
		// 값을 가져와야 할 때는
		// 배열이 담긴 변수 뒤에 대괄호([])를 사용하여
		// n번째 방에 접근하는 방식으로 값을 가져와야 한다.
		int[] intArr1 = {3, 7, 4}; // 선언과 동시에 초기화하는 쉬운 방식
		// 선언 후 따로 값을 넣을 땐 쓸 수 없는 방식이다.
//		int[] intArrTest = null; // 나중에 넣겠다.
//		intArrTest = {3, 6, 2}; // 나중에 넣을 때는 쓸 수 없는 방식
		
		
		// 직접 값을 넣는 방식
		int[] intArr2 = new int[] {3, 9, 3}; // 직접 값을 넣는 방식
		
		// 길이를 정해서 배열을 만드는 방식
		// 이때 들어가는 값들은 타입마다의 초기값 형태로 들어간다.
		int[] intArr3 = new int[10]; // {0,0,...,0}
		
		int[] intArrReturned = getArrayNumeric(100);
		for (int i = 0; i < intArrReturned.length; i++) {
			System.out.print(intArrReturned[i] + " ");
		}
		
		
		
		
	}
	// 0부터 입력된 숫자까지 반복적으로 출력하는 프로그램
	public static void printNums(int num1) {
		for (int i = 0; i < num1; i++) {
			System.out.println(i);
		} // 0 ~ 4까지 출력
		System.out.println(num1); // 5 출력
	}
	
	// 입력된 숫자만큼의 길이를 가진 배열을 반환하는 메서드
	public static int[] getArray(int length) {
		int[] result = new int[length];
		return result;
	}
	
	// 입력된 숫자만큼의 길이를 가진 배열을 반환하는 메서드
	public static int[] getArrayNumeric(int length) {
		int[] result = new int[length];
		for (int i = 0; i < result.length; i++) {
			result[i] = i;
		}
		return result;
	}
	
	
	
	
}






