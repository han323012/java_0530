package day6.practice;

public class StarEx1 {

	public static void main(String[] args) {
		/* ***** i=1
		 * ***** i=2
		 * ***** i=3
		 * ***** i=4
		 * ***** i=5
		 * */
		/* 외부 반복문
		 * 반복횟수 i는 1부터 5까지 1씩 증가
		 * 실행문 *5개를 출력후 엔터
		 * */
		/*내부 반복문
		 * *5개
		 * 반복횟수 j는 1부터 5까지 1씩 증가
		 * 규칙성 *을 출력
		 * */
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
