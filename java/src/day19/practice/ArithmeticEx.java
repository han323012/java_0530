package day19.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		//두 정수와 산술연산자를 입력했을 때 연산결과를 출력하는 코드를 작성하세요 
		//예외처리도 추가
		System.out.println("input (ex:1 + 2) : ");
		Scanner sc = new Scanner(System.in);
		try {
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
				System.out.println("not operator");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Wrong Input");
		}
		catch(ArithmeticException e) {
			System.out.println("not operation");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("EXIT");
			

		test1();	
		test2();	
		sc.close();
	}
	public static void test1() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception");
			return;
		}finally {
			System.out.println("1 Exit");
		}
	}
	public static void test2() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception");
			return;
		}
		System.out.println("2 Exit");
	}

}
