package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		
		System.out.println("몇월인지 입력해주세요. : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		
		case 3,4,5:                           //jdk 7이상 만 가능 ????????????????????????????
			System.out.println("봄");
		break;
		
		case 6,7,8:
			System.out.println("여름");
		break;
		
		case 9,10,11:
			System.out.println("가을");
		break;
		
		case 1,2,12:
			System.out.println("겨울");
		break;
		
		default:
			System.out.println("잘못된 달");
		
		}
		
		sc.close();
	}

}
