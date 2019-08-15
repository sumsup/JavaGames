package ch06.HangMan_Extends;

// super class.
public class Dog 
{

	// 이렇게 접근 지정자를 지정하지 않으면 default로 friendly 가 지정됨.
	// Friendly는 같은 패키지 내에서만 public 처럼 규정.
	String dog_name;
	int dog_age;
	
	public Dog(String name, int age) 
	{

		dog_name = name;
		dog_age = age;
		
	}
	
	public void bite() 
	{
		
		System.out.println(dog_name+"가 아무도 물지 않았습니다.");
	}
	
	public void bite(String name)
	{
		System.out.println(dog_name+"가 "+name+" 을/를 물었습니다.");
	}
	
	public void bark()
	{
		System.out.println("멍멍!");
		
	}
	
}
