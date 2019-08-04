package ch05.HangMan1;

public class ConstructorTest {
	
	public static void main(String[] args) {
		
		Clock c = new Clock(1, 24, 55);
		
		c.printTime();
		
	}

}

class Clock {
	
	int hour;
	int min;
	int sec;
	
	public Clock(int h, int m, int s) {

		hour = h;
		min = m;
		sec = s;
		
	}
	
	public void printTime() {
		
		System.out.println(hour + ":" + min + ":" + sec);
		
	}
	
}
