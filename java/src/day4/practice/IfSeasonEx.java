package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		
		
		System.out.println("몇월인지 입력해주세요. : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
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
		// 알겠습니다
		//
		
		
		
		
		
		sc.close();
	}

}
