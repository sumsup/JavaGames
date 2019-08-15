package ch06.HangMan_Extends;

public class Snoopy extends Dog
{
	
	public Snoopy()
	{
		
		super("스누피", 3); // Dog 클래스의 생성자에게 이름과 나이를 전달.
		
	}
	
	public void bite(String name, int age) // 매개변수가 2개인 bite() 메서드.
	{
		
		System.out.println(dog_name + "가 문 "+ name + "는 "+ age + "살 입니다. (메서드 오버로딩)");
		
	}
	
	public void bark()
	// Dog 클래스의 bark() 메서드와 오버라이딩 되는 매개변수가 없는 bark() 메서드.
	{
		
		System.out.println("안녕하세요, " + dog_name + "입니다. (메서드 오버라이딩)");
		
	}

}