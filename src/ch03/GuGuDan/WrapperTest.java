package ch03.GuGuDan;

public class WrapperTest {

	public static void main(String[] args) {
		
		int myInt = 5316;
		
		System.out.println("myInt = " + myInt);
		
		String myString = new Integer(myInt).toString(); 
		// int형 -> Integer형 객체 -> String형 객체. toString().
		
		System.out.println("myString = " + myString);
		
		myString = myString.replace('6','4'); // 5316 -> 5314.
		
		float myFloat = Float.valueOf(myString).floatValue();
		// String 형 객체 -> Float형 객체 -> float형. 
		
		System.out.println("myFloat = " + myFloat);
		
		// 결론 : 기본 자료형을 형변환 하기.
		// float, int, double 등으로 형변환 할 때에는 
		// new Float(변수), new Integer(변수), new Double(변수) 이렇게 wrapper 클래스로 감싸주고.
		
		// 변환하고 싶은 자료형으로 .floatValue() , .intValue() , .doubleValue(). 등으로 바꾼다.
		
		// 다만 String 형만 좀 다르다.
		// .toString() 으로 바꾼다.
		// String 형을 int나 float처럼 숫자형으로 바꿀 때는
		// Integer.valueOf(myString).intValue()
		// Float.valueOf(myString).floatValue() 이렇게
		// valueOf 에 String 형을 넣어서 바꾼다.
		
	}
	
}