package day8.pratice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {
		System.out.println("몇월인지 입력해주세요. : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		season(month);
		System.out.println(month +" is " + getSeason(month));
		sc.close();
		
	}
	public static void season(int month) {
		
		if(month >= 3 && month <= 5 ) {
			System.out.println("봄");
			
		}
		else if(month >= 6 && month <= 8) {
			System.out.println("여름");
			
		}
		
		else if(month >= 9 && month <= 11) {
			System.out.println("가을");
			
		}
		else if(month == 1 || month == 2 || month == 12 ) {
			System.out.println("겨울");
			
		}
		else {
			System.out.println("잘못된 달");
			
		}
	}
	/**월이 주어지면 주어진 월에 맞는 계절을 알려주는 메서드
	 * 매개변수 월
	 * 리턴타입 계절
	 * 메서드 명 getseason
	 * 
	 */
	public static String getSeason(int month) {
		if(month >= 3 && month <= 5 ) {
			return"봄";
			
		}
		else if(month >= 6 && month <= 8) {
			return"여름";
			
		}
		
		else if(month >= 9 && month <= 11) {
			return"가을";
			
		}
		else if(month == 1 || month == 2 || month == 12 ) {
			return"겨울";
			
		}
		else {
			return"잘못된 달";
			
		}
	}

}
