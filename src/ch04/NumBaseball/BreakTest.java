package ch04.NumBaseball;

public class BreakTest {
	
	public static void main(String[] args) {
		
		int i, j;
		
		i = 10;
		
		OUT_WHILE: while(true) // 반복문에 label을 붙여서 break 할 반복문을 선택 할 수 있다.
		{
			j = 0;
			while(true)
			{
				System.out.print("*");
				j++;
				if(j >= i) break; // 바로위 whilte문 탈출.
			}
			
			System.out.println();
			i--;
			if(i<=0) break OUT_WHILE; // OUT_WHILE 라벨이 붙은 반복문 탈출.
		}
		
		
	}

}
