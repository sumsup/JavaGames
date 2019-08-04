package ch04.NumBaseball;

public class CallByReferenceTest // public 메서드는 한 클래스 파일당 하나씩만 가능.
{
	
	public static void swap(Number z) 
	{
		int temp = z.x; // 10
		z.x = z.y; // 20
		z.y = temp; // 10
		
	}
	
	public static void main(String[] args) {
		
		Number n = new Number(); // 아래의 Number 클래스로 n 생성.
		n.x = 10;
		n.y = 20;
		
		System.out.println("swap() 메서드 호출 전: "+ n.x + ", " + n.y); // 10 , 20
		swap(n);
		System.out.println("swap() 메서드 호출 후: "+ n.x + ", " + n.y); // 20 , 10 
		// 주소값이 바뀌는 거라 바뀜.
		
	}
	
}

class Number 
{
	public int x;
	public int y;
	
}