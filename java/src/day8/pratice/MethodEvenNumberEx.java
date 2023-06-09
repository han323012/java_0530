package day8.pratice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		//정수 num을 입력받아 짝수인지 아닌지 판별하는 코드를 작성하세요
		//단 메서드를 이용할것 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1 = sc.nextInt();
		
		
		if(num1%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
		printEcenNumber(num1);
		
		
		if(mod(num1, 2)==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
		if(isEvenNumber(num1)) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
		if(isMultiple(num1,2)) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		sc.close();
		
	}
	/**
	 * num이 주어지면 num이 짝수인지 홀수인지 출력하는 메서드
	 * @param num 판별할 정수
	 * @return 없음 = void
	 * 메서드 명 printEcenNumber
	 */
	public static void printEcenNumber(int num) {
		if(num%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}
	/** num1과 num2가 주어지면 num1을 num2로 나누었을 때 나머지를 알려주는 메서드
	 * 매개변수 두 정수
	 * 리턴타입 나누었을때 나머지 정수 int
	 * 메서드명 mod
	 */
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	/**num이 주어지면 num이 짝수인지 홀수인지 알려주는 메서드 
	 * 매개변수 int num
	 * 리턴타입 짝수인지 홀수인지 boolean
	 * 메서드명 isEvenNumber
	 */
	public static boolean isEvenNumber(int num) {
		return num % 2 == 0;
	}
	/**num1과 num2가 주어지면 num1이num2의 배수인지 아닌지 알려주는 메서드
	 * 매개변수 두 정수 int num1, int num2
	 * 리턴타입 배수인지 아닌지
	 * 메서드명 isMultiple
	 * 
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
}
