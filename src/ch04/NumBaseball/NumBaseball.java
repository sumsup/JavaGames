package ch04.NumBaseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NumBaseball {
	
	public static int playGame() throws IOException { 
		// 메서드 안에 버퍼관련 코드가 있으면 IOException 처리를 해줘야 함.
		// 내부에서 호출한 메서드에 버퍼 관련 코드가 있어도 IOException 처리를 해야함.
		// 그냥 메서드에 Buffer 관련 로직이 연관되 있으면 무조건 try-catch나 IOException 으로 처리를 해줘야 함.
		
		int x, y, z;
		Random r = new Random();
		x = Math.abs(r.nextInt() % 9) + 1; // 1~9 까지 중 하나의 숫자로 난수 생성.
		
		do {
			
			y = Math.abs(r.nextInt() % 9) + 1;
			
		} while(y==x); // do-while문. 일단 한번은 무조건 실행하고, 다음은 조건문에 해당하면 계속 실행.
		// x와 y 값이 같으면 계속 실행.
		
		do {
			
			z = Math.abs(r.nextInt() % 9) + 1;
			
		} while((z==x || (z==y)));
		
		System.out.println(x + ", " + y + ", " + z);
		
		return playGame(x, y, z);
		
	}
	
	public static int playGame(int x, int y, int z) throws IOException {
		
		int count; // 문제를 푼 횟수.
		int strike, ball;
		
		int[] usr = new int[3]; // 사용자가 입력한 숫자 3개.
		int[] com = { x , y , z }; // 컴퓨터가 숨긴 숫자 3개.
		
		System.out.println("숫자 야구 게임");
		
		count = 0;
		
		do {
			
			count++;
			
			do {
				
				System.out.println("\n 카운트 : "+count);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 사용자의 입력을 받음.
				String user;
				
				System.out.println("1번째 숫자: ");
				user = in.readLine(); // 입력받은 값을 불러옴.
				usr[0] = new Integer(user).intValue(); // 사용자가 입력한 숫자를 인트형으로 형변환해서 배열에 저장.
				
				System.out.println("2번째 숫자: ");
				user = in.readLine();
				usr[1] = new Integer(user).intValue();
				
				System.out.println("3번째 숫자: ");
				user = in.readLine();
				usr[2] = new Integer(user).intValue();
				
				if((usr[0]==0) || (usr[1]==0) || (usr[2]==0)) { // 사용자 입력 숫자 3개중 하나라도 0이면?
					
					System.out.println("0은 입력하지 마세요. 다시 입력해주세요.");
					
				} else if((usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)) {
					
					System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력하십시오" );
					
				} else if((usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2])) {
					
					System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해 주세요.");
				}
				
			} while((usr[0]==0) || (usr[1]==0) || (usr[2]==0) || (usr[0] > 9) || (usr[1 ]> 9) || (usr[2] > 9) ||
					(usr[0]==usr[1]) || (usr[1]==usr[2]) || (usr[0] == usr[2])); 
			// do-while 문에서 while 문 안에 들어가는 조건이 참인 경우 do 로직을 계속 실행.
			
			strike = ball = 0;
			
			if(usr[0]==com[0]) strike++;
			if(usr[1]==com[1]) strike++;
			if(usr[2]==com[2]) strike++;
			
			if(usr[0]==com[1]) ball++;
			if(usr[0]==com[2]) ball++;
			if(usr[1]==com[0]) ball++;
			if(usr[1]==com[2]) ball++;
			if(usr[2]==com[0]) ball++;
			if(usr[2]==com[1]) ball++;
			
			System.out.println("Strike: " + strike + " Ball: "+ball);
			
			
		} while((strike < 3) && (count < 11)); // 3 strike거나 count가 12가 되면 종료.
		
		return count;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		int result;
		
		if(args.length ==3) {
			
			int x = Integer.valueOf(args[0]).intValue(); // 전달받은 String 인수를 Integer 형으로 형변환.
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();
			
			result = playGame(x,y,z);
			
		} else {
			
			result = playGame();
			
		}
		
		System.out.println();
		
		if(result <= 2) { // 문제를 푼 횟수에 따라 칭찬 메세지 출력.
			
			System.out.println("참 잘했어요!");
			
		} else if(result <= 5) { 
			
			System.out.println("잘했어요!");
			
		} else if(result <= 9) {
			
			System.out.println("보통이네요!");
			
		} else {
			
			System.out.println("분발하세요!");
			
		}
		
	}
	
}