package ch02.PaperScissorStone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {
	
	public static void main(String[] args) throws IOException {
		
		// 저수지(file)에 벨브(System.in)를 연결해서 파이프 라인(InputStreamReader)으로 물탱크(BufferedReader)에 물(입력데이터)을 저장.
				
		InputStreamReader isr = new InputStreamReader(System.in); 
		// InputStream(System.in) : 파이프 라인.
		// System.in : 저수지에 파이프 라인을 연결하는 벨브. 키보드 입력을 받는다.
		
		BufferedReader in = new BufferedReader(isr); // BufferedReader : 물탱크.
		
		String str;
		System.out.println("글씨를 입력하면 따라 합니다."); 
		str = in.readLine(); // readLine() : 수도 꼭지.
		System.out.println(str);
		
	}
	
}
