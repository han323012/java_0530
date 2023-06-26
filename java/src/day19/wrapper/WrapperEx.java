package day19.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		Integer num1 =10; //박싱 정수 10을 인티저 클래스 객체 넘1에 저장
		//num1 = null; //인티저가 객체이고 인트는 자료형이라 널이 기본적으로 안들어감
		int num2 =0;
		if(num1 != null) {
			num2 = num1;//언박싱 인티저 클래스 객체 널1에 있는 값을 널2에 저장 예외처리 필요
		}
		
		System.out.println(num1);
		System.out.println(num2);
		
		//Integer.parseInt와 같이 문자열을 기본자료형으로 변환하는 메서드를 사용할 때 예외처리 해주는 것이 좋음
		int num3 = Integer.parseInt("123");
			System.out.println(num3);
	}

}
