package day1.variable;

public class CharExample1 {

	public static void main(String[] args) {
		//변수타입 변수명;
		char ch1;
		//변수타입 변수명 = 초기값;
		char ch2 = ' ';
		//변수타입 변수명1, 변수명 2; //변수명1과 변수명2가 같은 타입인 경우
		char ch3, ch4;
		//변수타입 변수명1 = 초기값1, 변수명2 = 초기값2;
		// \u0000 진수 : 16진수에 맞는 문자를 가져옴
		//16진수 41 : 16*4 + 1*1
		// \n : 엔터 \t 탭키만큼 공백, \\ : \문자, '문자, \" : "문자 (c언어에 자주 사용됨)
		// 컨트롤 z 되돌리기 , 알트 방향키
		// \ 만으로는 무엇이 안됨
		char ch5 ='\u0041', ch6 = 65;
		char ch7 = '\n';
		System.out.println(ch7 + ch5);
		
		System.out.println(ch6);
		
		
			
	}

}
