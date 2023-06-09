package day8.homework;

import java.util.Scanner;

public class MethArithmeticEx {

	public static void main(String[] args) {
		//두 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요
		//메서드 이용, 연산자를 잘못 입력한 경우는 없다고 가정, 0으로 나누는 일은 없다고 과정
		int num1,num2;
		String op;
		Scanner sc =new Scanner(System.in);
		num1 = sc.nextInt();
		op = sc.next();
		num2 = sc.nextInt();
		sum(num1,op,num2);
		sc.close();
	}
	
	@SuppressWarnings("null")
	public static void sum (int num1, String op,int num2 ) {
		op = null;
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
	}

}
