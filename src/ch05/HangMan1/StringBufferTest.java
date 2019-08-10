package ch05.HangMan1;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// String 클래스의 경우, hello와 world를 합치면 새로운 문자열을 만들어서 레퍼런스 주소를 바꾼다.
		// 기존의 데이터를 바꾸려면 StringBuffer 클래스를 이용해야 한다.
		
		StringBuffer sb = new StringBuffer(); // StringBuffer형 변수 생성.
		
		sb.append('R');
		sb.append("ealty ");
		sb.append(2007);
		sb.append(' ');
		sb.append(7.5);
		System.out.println(sb);
		
		sb.insert(6, ", B");
		sb.insert(9, 'C');
		System.out.println(sb);
		
	}
	
}
