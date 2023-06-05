package day5.practice;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
		
		int a = 1;
		while(a <= 5) {
			System.out.println(a*2);
			a++;
			
			}
		System.out.println("=========================");
		
		int b = 2;
		while(b <= 10) {
			System.out.println(b);
			b = b+2;
		}
		System.out.println("=========================");
		int c =1;
		while(c <= 10) {
		if(c % 2 == 0) {
			System.out.println(c);
			c++;
			}
		}
			
	}

}
