package day8.pratice;

import java.util.Scanner;

public class MethodMultipleEx {

	public static void main(String[] args) {
		//문제 이해는 가지만 이것을 쓰는 이유가 뭘까? 나중에
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num1 =sc.nextInt();
		
		if (isMultiple(num1, 6)) {
			System.out.println("6의 배수입니다.");
		}
		else if (isMultiple(num1, 3)) {
			System.out.println("3의 배수입니다.");
		}
		
		else if(isMultiple(num1, 2)) {
			System.out.println("2의 배수입니다.");
		}
		else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		
		sum(num1);
		
		
		sc.close();
	}
	public static void sum(int num1) {
		if (num1 % 6 == 0) {
			System.out.println("6의 배수입니다.");
		
		}
		
		else if (num1 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		
		else if(num1 % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}
		else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
	}
	public static boolean isMultiple(int num1 , int num2) {
		return num1 % num2 == 0;
	}

}
