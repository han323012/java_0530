package day4.practice;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
		// 산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요
		// 이꼴 equals는 우리가 보는 문자로 바꿔주는 기능이라고 생각하자
		// 1번 char일 경우 op == '+' op = sc.next().charAt(0); 
		// 2번 String 일경우 op.equals("+") op = sc.next();
		// 1번과 2번의 차이를 알아놓자
		System.out.println("input 2 nums and arithmetic operator");
		Scanner sc = new Scanner(System.in);
				
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		
		if(op.equals("+")) {
			System.out.println("" + num1 + " " + "+" + " " + num2 + " " + "=" + " " + (num1 + num2));
		}
		else if (op.equals("-")) {
			System.out.println("" + num1 + " " + "-" + " " + num2 + " " + "=" + " " + (num1 - num2));
		}
		else if (op.equals("*")) {
			System.out.println("" + num1 + " " + "*" + " " + num2 + " " + "=" + " " + (num1 * num2));
		}
		else if (op.equals("/")) {
			System.out.println("" + num1 + " " + "/" + " " + num2 + " " + "=" + " " + (num1 / num2));
		}
		else if (op.equals("%")) {
			System.out.println("" + num1 + " " + "%" + " " + num2 + " " + "=" + " " + (num1 % num2));
		}
		else {
			System.out.println(op + " is not arithmetic operater.");
		}
		
		//오늘 문제만 푸는데 쪽지 시험 빌드업인가?
		
		sc.close();
		
		
	} 
	
	

}
