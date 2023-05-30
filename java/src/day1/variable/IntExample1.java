package day1.variable;

public class IntExample1 {

	public static void main(String[] args) {
		int num1;
		int num2 = 11; // 10진수
		int num3 = 0b11; // 2진수
		int num4 = 011; // 8진수
		int num5 = 0x11; // 16진수
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//1234567890123은 int로 표연 불가능한 큰 숫자
		//long 타입에 큰 숫자를 저장할 경우 리터럴에 L l 꼭 사용
		long num6 = 1234567890123L;
		System.out.println(num6);
		
				
	}

}
