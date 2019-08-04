package ch02.PaperScissorStone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PaperScissorStone {
	
	public static void main(String[] args) throws IOException {
		
		Random r = new Random(); // 랜덤 객체를 생성.
		
		int computer = Math.abs(r.nextInt() % 3); 
		// Math.abs : 절대값을 리턴.
		// r.nextInt() : 랜덤 클래스의 메서드. -21억 ~ + 21억 사이의 숫자를 반환함.
		// r.nextInt(10)은? 10 미만의 랜덤한 정수를 반환함 ex) 0 ~ 9.
		// 이 nextInt()를 % 3 으로 하면 0, 1, 2 셋중에 하나를 반환함.
		// nextInt() % 5 를 하면? 0,1,2,3,4 중 하나를 반환.
		// 이거는 그냥 공식처럼 외우고 있자. 원리까지는 아직 이해할 필요가 없다.
		
		//System.out.println(computer);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String user;
		System.out.print("가위, 바위, 보 중 하나를 선택 하세요. (가위 = a, 바위 = b, 보 = c)");
		
		user = in.readLine(); // 키보드 한줄 입력 받기.
		
		if(user.equals("a")) {
			
			if(computer == 0) System.out.println("무승부! (컴퓨터: 가위, 사람: 가위)");
			if(computer == 1) System.out.println("컴퓨터 승! (컴퓨터: 바위, 사람: 가위)");
			if(computer == 2) System.out.println("사람 승! (컴퓨터: 보, 사람: 가위)");
			
		} else if(user.equals("b")) {
			
			if(computer == 0) System.out.println("사람 승! (컴퓨터: 가위, 사람: 바위)");
			if(computer == 1) System.out.println("무승부! (컴퓨터: 바위, 사람: 바위)");
			if(computer == 2) System.out.println("컴퓨터 승! (컴퓨터: 보, 사람: 바위)");
			
		} else {
			
			if(computer == 0) System.out.println("컴퓨터 승! (컴퓨터: 가위, 사람: 보)");
			if(computer == 1) System.out.println("사람 승! (컴퓨터: 바위, 사람: 보)");
			if(computer == 2) System.out.println("무승부! (컴퓨터: 보, 사람: 보)");
			
		}
		
		
		
	}
	
}
