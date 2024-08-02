package javaBasic.method;

public class Student {
	static int downloadCount; // 공유 변수(shared variable)
	String name;
	int age;
	
	// 스태틱 블록
	static {
		System.out.println("static block");
		downloadCount = 0;
	}
	
	// 인스턴스 블록
	{
		System.out.println("instance block");
		downloadCount++;
	}
	
	
	// 생성자(constructor)
	// 생성자는 메서드의 일종이다.
	// 특수한 메서드다.
	// 메서드는 값을 받아서 기능을 수행하고,
	// 때에 따라서 어떤 값을 반환하는 역할.
	// 그런데 생성자는 반환은 하지 않는다.
		// 반환을 하지않는 이유는
		// 이미 반환할 값이 정해져 있기 때문이며
		// 반환할 값은 바로 해당 객체의 주소값이다.
	// 생성자의 이름은 클래스 이름과 동일하게 작성한다.
	public Student() {;} // 기본 생성자
	// 입력도 없고, 내용도 없다.
	
	public Student(String name, int age) { // 이름과 나이를 입력받고
		// 객체의 정보에 입력한다.
		this.name = name;
		this.age = age;
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		// 절차지향 언어
		String hongName = "홍길동";
		int hongAge = 20;
		
		String goName = "고길동";
		int goAge = 30;
		
		Student hong = new Student("홍길동", 20);
//		System.out.println(hong);
//		hong.name = "홍길동";
//		hong.age = 20;
//		System.out.println(hong.name);
		
		System.out.println(Student.downloadCount);
		
		
		
		
		
	}
}
