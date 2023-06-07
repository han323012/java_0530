package day6.nestedloop;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		/*구구단 2단부터 9단까지 출력하는 코드를 작성하세요
		 * 외부 반복문
		 * 반복횟수 : i는 A부터 B까지 1씩 증가
		 * 실행문 : i 단이 출력
		*/
		int i,j;
		for(i=2; i<=9; i++) {
			for(j=1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		//이 위치에서 i와 j의 값은?
		// i = 10 j = 10
	}

}
