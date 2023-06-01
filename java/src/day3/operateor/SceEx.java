package day3.operateor;

public class SceEx {

	public static void main(String[] args) {
		String str = null;
		//str이 null이기 때문에 str.xx 으로 되어있는 모든곳에서 에러가 발생
		//그런데 && 연산자 앞에서 null체크하는 코드가 먼저 있기 때문에 null인 경우에
		//앞 부분이 거짓이 되서 뒤부분인 문제가 되는 코드를 실행하지 않아서 무사히 넘어감(SCE)
		System.out.println("Is " + str + "equal to abc? " 
							+ (str != null && str.equals("abc") ));
		//아래 코드는 위 콛에서 순사만 변경한 코드로, 문제가 되는 코드를 먼저 실행하기 때문에 에러가 발생
		/* System.out.println("Is " + str + "equal to abc? " 
						+ (str.equals("abc") && str != null ));
						*/
		//이것도 숙제 빌드업인가?
		//단락회로평가
		
	}

}
