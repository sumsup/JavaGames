package ch05.HangMan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HangMan2 extends Hangman {
	
	String[] words = {"influenza", "fever", "cancer", "poison", "victim", "physician", "clinic", "symptom", "medicine", "drug", "hygiene"};
	String[] meaning = {"독감", "열", "암", "독", "환자", "내과의사", "진료소", "징후", "의학", "약", "위생학"};
	
	// 생성자. 난수를 발생시킴.
	public HangMan2() {
		
		Random r = new Random();
		
		int randomNum = Math.abs(r.nextInt() % words.length); // 난수를 발생시켜 글자 길이로 나눈 나머지를 절대값 화. => 글자 길이를 넘지 않는 랜덤 난수 발생.
		
		hiddenString = words[randomNum]; // 문제가 저장된 배열 중 하나를 선택. super클래스의 멤버 변수를 사용 가능.
		
		System.out.println("\n의미: " + meaning[randomNum]);
		
	}
	
	
	public char readChar() throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;
		
		do {
			
			System.out.println("문자 하나를 입력 하세요.(힌트를 원하면 ? 입력) : ");
			user = in.readLine();
			
			if(user.charAt(0) == '?') { // 힌트를 원해서 ?를 입력 했다면?
				
				boolean givehint = false; // 힌트를 줬는지 안줬는지.
				
				int i = 0;
				
				while(!givehint) { 
					
					if(outputString.charAt(i) == '-') {
						
						System.out.println();
						System.out.println("힌트 : " + hiddenString.charAt(i));
						System.out.println();
						
						failed++;
						
						givehint = true;
						
					}
					
					i++;
					
				}
			}
			
		} while(user.charAt(0) == '?'); // 입력이 ? 일 때까지.
		
		return user.charAt(0);
		
	}
	
}