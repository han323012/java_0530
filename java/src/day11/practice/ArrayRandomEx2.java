package day11.practice;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		int min = 1, max = 9;
		int [ ] randomNum = new int[3];
		//방법1 9번지까지 있는 배열을 이용
		//장점 작업이 단순
		//단점 저장 공간이 필요
		boolean checkArr[] = new boolean[10];
		
		for(int i = 0; i < 3; ) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			 //checkArr배열에 random번지에 있는 값이 false이면 
			 if(!checkArr[random]) {
				 //멋을 추구하는 우리 강사님 멋있어
				 //random을 배열에 저장
				 randomNum[i]= random;
				 //i를 증가
				 i++;
				 //checkArr배열에 random번지에 있는 값을 true로 변경
				 checkArr[random]= true;
			 }
		}
		for(int i = 0; i < 3; i++) {
			 System.out.println(randomNum[i]);
		}
		  //방법2 저장된 값들을 비교
		int count = 0;
		int i = 0;
		while(count < 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			 //이미 저장된 랜덤수들과 하나하나 비교서 같은게 있는지 확인하여 있으면 반복문 종료
				for(i = 0; i < count; i++) {
					if(random == randomNum[i]) {
						break;
					}	
				}
			  /* 위 반복문에서 break를 만나지 않으면 i는count일 때 종료하기 때문에
			   * 반복문 종료 후 i는count와 같다
			   * 하지만 break를 만나서 중간에 빠져나오면 i는count보다 작다
			   */
				if(i == count) {
					randomNum[count] =random;
					count++;
				  //randomNum[count++] =random;
			}
		}
		  
		 System.out.println("==============");
		 for(i = 0; i < 3; i++) {
		  System.out.println(randomNum[i]);
		  }
		 System.out.println("=============");
		 printArray(randomNum);
		 
		 //방법3 방법 2를 메서드로 변형
		 count =0;
		 while(count <3) {
			 int random = (int)(Math.random() * (max - min + 1) + min);
			 //중복되지 않으면 배열에 저장 후 count 증가
			 if(!contains(randomNum, random, count)) {
				 randomNum[count++] =random;
			 }
		 }
		 System.out.println("=============");
		 createRandomArray(min, max, randomNum);
		 System.out.println("=============");
		 printArray(randomNum);
		 
	}
	/** 정수형 배열이 주어지면, 정수형 배열의 값을 콘솔에 출력하는 메서드
	 * 매개변수
	 * 리턴타입
	 * 메서드명 printArray
	 */
	public static void printArray(int randomNum[]) {
		int i;
		  for(i = 0; i <randomNum.length; i++) {
			  System.out.println(randomNum[i]);
		  }
	}
	/**정수 num와 배열의 0번지 부터 count개만큼 확인했을 때 
	 * 중복된 값이 있는지 없는지 알려주는 메서드
	 * 매개변수
	 * 리턴타입
	 * 메서드명 contains
	 */
	public static boolean contains(int randomNum[], int num, int count) {
		for(int i = 0 ; i < count; i++) {
			//중복되면 메서드를 종료하면서 중복됐다고 알려줌
			if(num == randomNum[i]) {
				return true;
			}		
		}
		//이 위치까지 왔다는건 return true를 못 만났다는 뜻이고
		//그 말은 중복되지 않았다는 뜻
		return false;
		
	}
	/**min에서 max사이의 랜덤한 수를 생성해서 배열에 저장하는 메서드
	 * 매개변수
	 * 리턴타입
	 * 메서드명 createRandomArray
	 */
	public static void createRandomArray(int min, int max, int randomNum[]) {
		//배열이 생성되어 있지 않으면 메서드 종료
		if(randomNum == null) {
			return;
		}
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면
		//1~3 3개가 4개짜리 중복되지 않게 배열에 들어갈 수 없음
		if(max - min +1 <randomNum.length) {
			return;
		}
		
		int count =0;
		while(count <3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//중복되지 않으면 배열에 저장 후 count 증가
			if(!contains(randomNum, random, count)) {
				randomNum[count++] =random;
			}
		}
	}

}







