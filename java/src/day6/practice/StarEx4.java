package day6.practice;

public class StarEx4 {

	public static void main(String[] args) {
	//정신차려 수업 이수 할려면 집중해야할꺼 아니야 
		//한동규 정신차려
			//괄호 신경쓰라고 제발
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(' ');
				
			}
			for(int j=1; j <= i; j++) {
				System.out.print('*');
					
			}	
			for(int j=1; j <= i-1; j++) {
				System.out.print('*');
					
			}	
				System.out.println();
		}
	}

}
