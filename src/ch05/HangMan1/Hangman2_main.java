package ch05.HangMan1;

import java.io.IOException;

public class Hangman2_main {

	public static void main(String[] args) throws IOException {
		
		HangMan2 hangman = new HangMan2();
		
		int result = hangman.playGame(); // 게임을 실행.
		
		System.out.println();
		
		if(result <= 2) {
			
			System.out.println("참 잘했어요");
			
		} else if(result <= 3) {
			
			System.out.println("잘했어요!");
			
		} else if(result <= 4) {
			
			System.out.println("보통이네요!");
			
		} else  {
			
			System.out.println("분발하세요!");
			
		}
		
	}
	
}