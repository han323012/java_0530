package day3.practice;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요. : ");
	
		int num =sc.nextInt();
		if(num == 0) {
			System.out.println("0입니다.");
			
		}
		if(num > 0) {
			System.out.println(num + " 양수입니다.");
			
		}
		if(num < 0) {
			System.out.println(num + " 음수입니다.");
			
		}
		sc.close();

	}

}
