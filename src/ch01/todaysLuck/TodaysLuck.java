package ch01.todaysLuck;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TodaysLuck {

	public static void main(String[] args) {
		
		Date today = new Date(); // 오늘의 날짜 객체를 생성.
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일의 "); // 날짜 포맷을 지정.
		
		System.out.println(dateForm.format(today)); // 오늘의 날짜를 날짜 형식에 맞춰서 콘솔에 출력.
		
		Random r = new Random(); // 난수 생성.
		
		int randomNum = Math.abs(r.nextInt() % 100) + 1; 
		// 난수를 -99 ~ 99 까지 생성하고 Math.abs() 로 양수만 남김.
		// 거기에 1을 더해주면 1에서 100 까지의 난수를 생성하게 됨.
		
		System.out.println("금전운 : " + randomNum + "%"); // 금전운을 출력.
				

	}

}