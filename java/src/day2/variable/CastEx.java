package day2.variable;

public class CastEx {

	public static void main(String[] args) {
		//3.14는 double형 리터럴이기 때문에 int에 저장할수 없음. 강제 형변환 필요
		int pi = (int) 3.14;
		//3은 int형 리터럴이기 때문에 double에 저장 가능 자동 형변환 (정수 < 상수)
		double num1 =3;
		//123L은 long형 리터럴이기 때문에 int에 저장할수없음. 강제 형
		//실제 데이터 분실이 없어도 타입에 맞게 강제형변환을 해 (int < long)
		int num2 = (int)123L;
		
		System.out.println(pi);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println((double)1/2);
		
	}

}
