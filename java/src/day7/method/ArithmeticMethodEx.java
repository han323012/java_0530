package day7.method;

public class ArithmeticMethodEx {
	
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sub(1,2));
		System.out.println(mul(1,2));
		System.out.println(div(1,2));
		System.out.println(mod(1,2));
		sum2(1,2);
		//Sysyem.out.println(1+2); 랑 같다
	}
	/**
	 * 주어진 num1 num2의 합을 출력하는 메소드
	 * 더하는 기능과 출력하는 기능이 같이 들어가있음
	 * 같이 들어가있는건 좋은건 아님
	 * @param num1
	 * @param num2
	 
	 */
	public static void sum2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	/**
	 * 
	 * @param num1 정수 1
	 * @param num2 정수 2
	 * @return 
	 */
	
	public static int sum (int num1, int num2) {
		return num1 + num2;
	}
	public static int sub (int num1, int num2) {
		return num1 - num2;
	}
	public static int mul (int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		return num1 / (double)num2;
	}
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
}
