package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		/* 세변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드를 작성하세요.
		 * 세 변 중 작은 두 변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		 * */
		int max;
		System.out.println("세 변의 길이를 입력하세요. :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1 > num2) {
			max = num1;
			if( num1 > num3 ) { 
				max = num1;
		}
			else {
			max = num3 ;
			}
		}
		else if(num2 > num3) {
			max = num2 ;
		}
		else {
			max = num3;
		}
		if ( num1 + num2 + num3 - max > max) {
			System.out.println("삼각형이 가능합니다.");
		}
		else {
			System.out.println("삼각형입니다.");
		}
		//max = num1 > num2 ? (num1 > num3 ? num2 > num3) : (num2 > num3 ? num2 : num3)
		
		sc.close();
		
	
	}

}
