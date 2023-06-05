package day5.practice;

public class RandomEx {

	public static void main(String[] args) {
		//min부터 max사이의 랜덤한 점수를 만드는 코드를 작성하세요.
		//Math.random() : 0이상 1미만의 실수를 랜덤으로 생성
		//0이상 1미만
		//0 <= r < max - min +1
		// min <= r * (max-min +1 ) < max +1
		int min =1 ,max =10;
		int random = (int)(Math.random() * (max - min + 1) +min);
		System.out.println(random);
	}

}
