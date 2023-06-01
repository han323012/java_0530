package day3.operateor;

public class AritmeticEx {

	public static void main(String[] args) {
		/* byte 더하기 정수 char 더하기 정수는 결과가 int여서 byte 나 char에 바로 저장 불가
		 * 자료형 변환을 이용해서 저장해야 한다
		 * */
		byte num1 = 3;
		System.out.println(num1);
		num1 = (byte)(num1 + 5);
		System.out.println(num1);
		
		char ch = 'A';
		System.out.println(ch);
		ch = (char)(ch + 1);
		System.out.println(ch);
		
		int num2 =3;
		System.out.println(num2);
		num2 = (int)(num2 + 4.0);
		System.out.println(num2);
	}

}
