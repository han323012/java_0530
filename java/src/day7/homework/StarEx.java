package day7.homework;

public class StarEx {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <=5 - i; j++) {
				System.out.print(' ');
				
			}
			for(int j=1; j <= i-5; j++) {
				System.out.print('*');
					
			}	
			for(int j=1; j <= i-1; j++) {
				System.out.print('*');
					
			}	
				
			for(int j=1; j <= i-5; j++) {
				System.out.print('*');
					
			}	
			for(int j=1; j <= i-6; j++) {
				System.out.print('*');
					
			}	
			for(int j = 1; j <=5 - i; j++) {
				System.out.print(' ');
				
			}
				System.out.println();
		}
	}
	//밥
	

}
