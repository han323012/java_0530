package day4.practice;

import java.util.Scanner;

public class IfMultipleEx1 {

	public static void main(String[] args) {
		//정수 num를 입력받아 num이 2의 배수인지 아닌지 판별하는 코드를 작성하세요
		// 정신차리자 
		System.out.println("수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}
		else {
			System.out.println("2의 배수가 아닙니다.");
		}
		
			
		
		
	}

}
