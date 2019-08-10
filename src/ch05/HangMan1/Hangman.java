package ch05.HangMan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman {
	
	String hiddenString; // 숨겨진 문자열 (문제)
	StringBuffer outputString; // 플레이어의 입력에 따른 결과로 보여줄 문자열
	StringBuffer inputString; // 플레이어가 입력한 문자들의 모임
	int remainder; // 못 맞히고 남아있는 문자의 수
	int failed; // 실패한 횟수
	
	public Hangman() {
		
		hiddenString = "hello"; // 문제는 "hello"
		
	}
	
	public int playGame() throws IOException {
		
		outputString = new StringBuffer();
		
		for(int i = 0; i < hiddenString.length(); i++) {
			
			// 문제 단어의 문자수만큼 - 를 출력
			outputString.append('-');
			
		}
		
		inputString = new StringBuffer(); 
		
		remainder = hiddenString.length(); // 못 맞추고 남아있는 문자의 수.
		
		failed = 0;
		
		System.out.println("\n 단어(" + hiddenString.length() + "글자" + ") : " + outputString);
		
		drawMan(); // 교수대 그리기
		
		do {
			
			checkChar(readChar()); // 한 문자를 입력 받아서 정답인지 확인
			System.out.println("\n 단어(" + hiddenString.length() + "글자" + ") : " + outputString);
			
			drawMan(); // 교수대 그리기
			
		} while ((remainder > 0 ) && (failed < 6)); // 못맞춘 글자수가 0보다 크거나 실패횟수가 6회보다 작으면 계속 진행.
		
		return failed;
		
	}
	
	// 입력문자 조사.
	public void checkChar(char guess) {
		
		boolean already = false;
		
		for(int i = 0; i < inputString.length() ; i++) {
			
			if(inputString.charAt(i) == guess) { // 이미 입력한 문자인지 조사.
				
				System.out.println("\n이미 입력한 문자 입니다! 다시 입력해주세요.");
				already = true;
				
			}
			
		}
		
		if(!already) { // 이미 입력한 문자가 아니면?
			
			inputString.append(guess); // 입력한 문자들의 모임에 추가.
			
			boolean success = false;
			
			for(int i = 0; i < hiddenString.length(); i++) { 
				
				if(hiddenString.charAt(i) == guess) { // 해당문자가 정답(hiddenString)에 있으면
					
					outputString.setCharAt(i, guess); // 표시문자의 i번째 인덱스에 사용자가 입력한 단어(guess)를 넣는다.
					
					remainder--; // 못 맞히고 남아있는 문자의 수를 하나 줄여 준다.
					
					success = true; // 맞췄는지 여부에 true를 입력.
				}
				
			}
			
			if(!success) failed++; // 만약 못맞췄으면 실패수 + .
			
		}
		
	}
	
	public void drawMan() {
		
		System.out.println(" ┌─────┐");
		System.out.println(" │          │");
		
		switch(failed) { // 실패 횟수에 따라 교수대에 사람을 그림.
		
		case 0 : 
			
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			break;
			
		case 1 :
			
			System.out.println("    ◎      │"); // 1번 실패한 경우 머리 그림.
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			break;
			
		case 2 :
			
			System.out.println("    ◎      │"); // 2번 실패한 경우 왼팔 그림.
			System.out.println("  ┌│      │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			break;
			
		case 3 : 
			
			System.out.println("    ◎      │"); // 3번 실패한 경우 몸통 그림.
			System.out.println("  ┌│      │");
			System.out.println("    │      │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			break;
			
		case 4 : 
			
			System.out.println("    ◎      │"); // 4번 실패한 경우 오른팔 그림.
			System.out.println("  ┌│┐    │");
			System.out.println("    │      │");
			System.out.println("            │");
			System.out.println("            │");
			System.out.println("            │");
			break;
			
		case 5 :
			
			System.out.println("    ◎      │"); // 5번 실패한 경우 왼다리 그림.
			System.out.println("  ┌│┐    │");
			System.out.println("    │      │");
			System.out.println("  ┌┴      │");
			System.out.println("  │        │");
			System.out.println("            │");
			break;
			
		case 6 :
			
			System.out.println("    ◎      │"); // 6번 실패한 경우 오른다리 그림.
			System.out.println("  ┌│┐    │");
			System.out.println("    │      │");
			System.out.println("  ┌┴┐    │");
			System.out.println("  │  │    │");
			System.out.println("            │");
			break;
		
		}
		
	}
	
	// 사용자의 입력 문자를 받는 기능.
	public char readChar() throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;
		
		System.out.println("1 문자를 입력하세요 : ");
		
		user = in.readLine(); // 키보드로 부터 한줄을 입력받음.
		
		return user.charAt(0); // 입력받은 문자열중 첫번째 문자를 반환.
		
	}
	

}
