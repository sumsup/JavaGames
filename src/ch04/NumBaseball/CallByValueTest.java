package ch04.NumBaseball;

public class CallByValueTest {
	
	public static void swap(int x , int y ) {
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("swap() 내부 : "+ x + ", "+ y); // 20 , 10
		
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("swap() 메서드 호출 전 : " + a + ", " + b); // 10 , 20
		swap(a, b);
		System.out.println("swap() 메서드 호출 후 : " + a + ", " + b); // 10 , 20
		
	}

}