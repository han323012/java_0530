package day2.scanner;

import java.util.Scanner; //컨트롤 쉬프트 o

public class ScannerEx {

	public static void main(String[] args) {
		//System.in 표준입력
		//표준 입력을 이용해서 스캐너를 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		
		int num1 = sc.nextInt(); // 정수를 입력받음 먼저 입력하고 엔터
		System.out.println(num1);
		
		System.out.println("실수를 입력해주세요.");
		double num2 = sc.nextDouble(); // 실수를 입력받음 먼저 입력하고 엔터
		System.out.println(num2);
		
		System.out.println("문자열1를 입력하세요.");
		sc.nextLine(); // 남아있는 엔터 처리기
		String str1 = sc.nextLine(); //스페를 포함한 문자열 한줄을 읽어옴
		System.out.println(str1);    //안녕 홍길동 했을때 문장 한줄 다 읽어오는 것
		
		System.out.println("문자열2을 입력하세요.");
		String str2 = sc.next(); // 첫번째 문자부터 읽어와서 다음 공백이 오기 전까지 읽어옴
		System.out.println(str2); // 얘는 안녕 홍길동 했을때 첫 단어만 먹고 버린다 그래서 안녕만 남아있다
		
		System.out.println("문자를 입력하세요.");
		char ch = sc.next().charAt(0); // next()를 이용하여 한단어를 읽어오고 읽어온 단어의 첫글자를 가져옴
		System.out.println(ch);       // 홍길동에서 홍만 가져간다 길동이 버려지고 엔터 남이있다
		
		
		sc.close(); // close()로 닫지 않아도 크게 문제는 없지만 안쓰면 주의표시가 생김
		
	}

}
