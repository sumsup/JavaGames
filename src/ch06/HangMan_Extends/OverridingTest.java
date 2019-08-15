package ch06.HangMan_Extends;

public class OverridingTest {

	public static void main(String[] args) {
		
		Dog yourDog = new Dog("벤지", 4); // Dog 형 객체 생성.
		
		yourDog.bark();
		yourDog.bite("우체부");
	
		Snoopy myDog = new Snoopy(); // Snoopy 생성.
		
		myDog.bark(); // 오버라이딩 된 메서드.
		myDog.bite("연우", 23); // 오버 라이딩 된 메서드.
		
	}

}
