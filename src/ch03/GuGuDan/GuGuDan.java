package ch03.GuGuDan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuGuDan {
	
	public static void main(String[] args) throws IOException {
		
		int x, y;
		Random r = new Random(); // 랜덤객체 생성.
		
		if(args.length==1) { // 인수가 있으면 인수로 준 값으로 문제 출제.
			
			x = Integer.valueOf(args[0]).intValue(); // 매인으로 전달받은 인수중 첫번째 인자를 int형으로 캐스팅.
			
		} else { // 넘겨준 인수가 없으면?
			
			x = Math.abs(r.nextInt() % 9) + 1; // -8 ~ 8 까지의 숫자중 임의의 값을 하나 반환하여 절대값화.
			// r.nextInt() => -21억 ~ 21억 사이의 임의의 값을 반환.
			// 거기에 % 9 를 해주면 -8.-7,-6,-5,-4,-3,-2,-1, 0 ,1,2,3,4,5,6,7,8 의 숫자중 임의의 값 하나를 반환.
			// 거기에 Math.abs를 해서 절대값을 씌워주면 결국 0~8 까지의 숫자중 하나를 반환한다.
			// 거기에 1을 더하면? x 는 1~9 중 하나를 반환하게 되는 것.
			
			// 결국 9가지 랜덤한 경우가 필요할 떄 % 9 를 해준다.
			// 공식처럼 외워 두자.
			
		}
		
		y = Math.abs(r.nextInt() % 9) + 1;
		
		int num = x * y;
		
		System.out.println(x + " * " + y + " = ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// System.in : 사용자 입력의 연결고리.
		// InputStreamReader : 데이터 저수지.
		// BufferedReader : 데이터 물탱크로 물을 받음.
		
		String user;
		user = in.readLine();
		
		int inputNum = new Integer(user).intValue(); // 유저로부터 입력받은 String 값을 int형으로 변환.
		
		if(num==inputNum) { // 정답과 입력받은 값을 비교.
			
			System.out.println("맞았습니다!");
			
		} else {
			
			System.out.println("틀렸습니다. 정답은 "+ num + "입니다.");
			
		}
		
	}

}