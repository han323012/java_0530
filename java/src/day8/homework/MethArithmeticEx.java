package day8.homework;

import java.util.Scanner;

public class MethArithmeticEx {

	public static void main(String[] args) {
		//두 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요
		//메서드 이용, 연산자를 잘못 입력한 경우는 없다고 가정, 0으로 나누는 일은 없다고 과정
		/*int num1,num2;
		char op;
		Scanner sc =new Scanner(System.in);
		num1 = sc.nextInt();
		op = sc.next().charAt(0);
		num2 = sc.nextInt();
		sum(num1,op,num2);
		sc.close();
		*/
		double res;
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		res = arithmetic(num1,op,num2);
		System.out.println(num1 + " " + op + " " + num2 + " = " + res);
		res = at(num1,op,num2);
		System.out.println(num1 + " " + op + " " + num2 + " = " + res);
		sc.close();
		
	}
	
	/**두 정수와 산술 연산자가 주어지면 산순 연산 결과를 알려주는 메서드
	 * 매개변수 두 정수와 산술 연산자 int num1 char op  int num2
	 * 리턴 타입 산술 연산 결과 실수 double
	 * 메서드명 arithmetic
	 */
	/*public static double sum(int num1, char op,int num2 ) {
		if(op == '+') {
			System.out.println("" + num1 + " " + "+" + " " + num2 + " " + "=" + " " + (num1 + num2));
		}
		else if (op == '-') {
			System.out.println("" + num1 + " " + "-" + " " + num2 + " " + "=" + " " + (num1 - num2));
		}
		else if (op == '*') {
			System.out.println("" + num1 + " " + "*" + " " + num2 + " " + "=" + " " + (num1 * num2));
		}
		else if op == '/') {
			System.out.println("" + num1 + " " + "/" + " " + num2 + " " + "=" + " " + (num1 / num2));
		}
		else if (op == '%') {
			System.out.println("" + num1 + " " + "%" + " " + num2 + " " + "=" + " " + (num1 % num2));
		}
		else {
			System.out.println(op + " is not arithmetic operater.");
		}
	}*/
	public static double arithmetic(int num1, char op, int num2) {
		double res = 0.0;
		switch(op) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / (double)num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		default:
			//잘못된 연산자인 경우 예외처리를 해야 하는데 아직 안배워서 주석처리
			//throw new RuntimeException("Wrong operator ");
		}
		
		return res;
	}
	public static double at(int num1, char op, int num2) {
		switch(op) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / (double)num2;
		case '%':
			return num1 % num2;
		default:
		}
		return 0.0;
	}

}
