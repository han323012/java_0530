package day8.pratice;

import java.util.Scanner;

public class MethGCDEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd =gcd(num1,num2);
		System.out.println(num1 + " and " + num2 + " gcd : " + gcd);
		printEcenNumber(num1, num2);
		sc.close();
	}
	public static void printEcenNumber(int num1, int num2) {
		int i = 1;
		int gcd = 0;
	
	
		while(i <= num1) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
				i++;
		}
	}
	public static boolean isMultiple( int num1, int num2) {
		return num1 % num2 == 0;
	}
	/** 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메서드
	 * 매개변수 두 정수
	 * 리턴타입 최대 공약수 정수 
	 * 매서드명 gcd
	 * 
	 */
	public static int gcd(int num1, int num2) {
		for(int i = num1; i>=1; i--) {
			if (isMultiple(num1, i) && isMultiple(num2, i)) {
				return i;
			}
		}
		return 1;
	}
}
