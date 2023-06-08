package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {
		//a부터 z까지 출력하세요
		char ch= 'a';
		int i;
		for(i=0; i<26; i++) {
			ch = (char)('a' + i);
			if(i==26) {
				break;
			}
			System.out.println(ch);
		}
			System.out.println("=================");
			
			for(ch='a';ch<='z';ch++) {
				System.out.println(ch);
			}
	}

}
