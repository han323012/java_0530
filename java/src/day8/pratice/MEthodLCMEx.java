package day8.pratice;

import java.util.Scanner;

public class MEthodLCMEx {

	public static void main(String[] args) {
		// A ga B gb
		// g 최대공약수
		// l  A*B/g
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int lcm = num1*num2/gcd(num1,num2);
		int lcm4 =lcm2(num1,num2);
		System.out.println(lcm4);
		int lcm3 = lcm1(num1,num2);
		System.out.println("#" + lcm3);
		System.out.println(num1 + " and " + num2 + " Lcm : " + lcm);
		sc.close();
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
	public static int lcm1(int num1, int num2) {
		for(int i = num1; i<= num1*num2; i+=num1) {
			//공배수를 찾음 isMultiple은 배수를 찾는 매서드이고
			//i가num1의 배수들이기 때문에 i가 num2의 배수이면 num1과 num2의 공배수가 됨
			if(isMultiple(i,num2)) {
				return i;
			}
		}
		return num1*num2;
	}
	public static int lcm2(int num1, int num2) {
	 return num1 * num2 /gcd(num1,num2);
	}
}
