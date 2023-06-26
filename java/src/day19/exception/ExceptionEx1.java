package day19.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/*num2값이 0이여도 오류가 표시 안됨
		 * 하지만 예외가 발생해서 프로그램이 중단
		 * 코드상으로 오류가 표시되지 않지만 의도치 않게 프로그램이 중단되는 경우
		 * RuntimeExcption
		*/
		
		int num1 = 1, num2 = 0;
		
		System.out.println(num1/num2);
	}

}
/**
 
class A implements Clomeable{
	//클론 메서드를 오버라이딩 하기 위해서 오브잭트 클래스의 클론을 호출함ㄴ
	// 클론낫서포티드잇셋션이 발생할 수 있다
	//클론낫서포티드잇셋션은 런타입잇셋션 클래스의 자식 클래스가 아니다
	//반드시 예외 처리 해야함 
	@Override
	public Object clone() {
		return super.clone();
	}
}
*/