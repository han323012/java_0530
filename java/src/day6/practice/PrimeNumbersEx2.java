package day6.practice;

public class PrimeNumbersEx2 {

	public static void main(String[] args) {
		//2부터 100사이의 소수를 출력하는 코드를 작성하세요
		int i ;
		int j ;
		int count ;
		//i가 소수이면 i를 출력하는 코드
		for(i = 2; i <= 100; i++) {
			
			for(j = 1 , count = 0; j <= i; j++) {
			
				if(i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		
		}
		
	}
	
}




