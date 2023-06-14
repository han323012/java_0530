package day11.practice;

public class ArrayRandomEx {

	public static void main(String[] args) {
		//1~9사이의 랜덤한 수를 3개 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요
		int min =1, max = 9;
		int [ ] randomNum = new int[3];
		
		  for(int i = 0; i < 3; i++) {
			  randomNum[i] = (int)(Math.random() * (max - min + 1) + min);
			  //int random = (int)(Math.random() * (max - min + 1) + min);
			  //randomNum[i] = random;
			  System.out.println(randomNum[i]);
			
		}
		
	}

}
