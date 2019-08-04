package ch04.NumBaseball;

public class ContinueTest {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 10) {
			
			i++;
			if(i%2 == 0) continue; // 짝수인 경우에는 조건문 처음부분으로 continue.
			System.out.println(i);
			
		}
		
	}

}