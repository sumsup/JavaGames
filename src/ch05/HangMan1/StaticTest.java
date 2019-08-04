package ch05.HangMan1;

public class StaticTest {

	public static void main(String[] args) {
		
		MyClass[] mc = new MyClass[10]; // 10개의 MyClass형 객체를 갖는 배열 선언.
		
		for(int i=0; i < 10; i++) {
			
			mc[i] = new MyClass();
			System.out.println("MyClass Instance의 수 : "+ mc[0].getObjectNum() + "개");
			// 객체를 생성할 때마다 static int object_num 의 값을 1씩 올려줬기 때문에 기억하고 있음.
			
		}
		
	}
	
}

class MyClass {
	
	static int object_num = 0;
	
	public MyClass() {
		
		object_num++; // 객체가 생성될 때마다 object_num 의 값을 1씩 증가.
		
	}
	
	public static int getObjectNum() {
		
		return object_num;
		
	}
	
}
