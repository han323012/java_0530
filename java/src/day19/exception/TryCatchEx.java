package day19.exception;

public class TryCatchEx {

	public static void main(String[] args) {
		/*	catch는 최소 1개는 필요
		 * 어떤 예외가 발생할지 모를때에는 Exception을 이용
		 */
		
		
		try {
			//예외가 발생할 수 있는 코드
			System.out.println(1 / 0);//ArithmeticException발생
			//첫번째 캐치로 가서ArithmeticException클래스의 객체를 Exception로 변환 가능한지 확인하고
			//가능하면 처리함
		}
		catch(ArithmeticException e) {
				System.out.println("예외 처리를 합니다");
		}
		catch(Exception e) {
			//예외처리
			System.out.println("예외처리를 합니다");
		}
		//위에 Exception에서 모든 예외가 걸리기 때문에 아래있는 캐치를 실행할 일이 없음
		/*catch(ArithmeticException e) {
			System.out.println("예외 처리를 합니다");
		}
		*/
		System.out.println("프로그램 종료");
		
	}

}
