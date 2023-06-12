package day8.homework;

public class MethodScoreEx2 {

	public static void main(String[] args) {
	//성적을 입력받아 학점을 출력하는 코드를 작성하세요
		double score = 70;
		System.out.println(getGrade(score));
	}
	/**성적이 주어지면 학점을 알려주는 메서스
	 * 매개변수 성적 실수 double score
	 * 리턴타입 String
	 * 메서드명 getGrade
	 */
	public static String getGrade(double score) {
		if(score > 100 || score <0) {
			return "Wrong score";
		}
		/*100점이면 A
		 * 90 A 
		 * 80 B
		 * 70 C
		 * 60 D
		 * 그외 F
		 */
		//성적이 몇점대인지 확인하기 위한 정수
		//9가 나오면 90점대
		int res = (int)(score/10); 
		switch(res) {
		case 10: 
		case 9 :
			return "A";
		case 8 :
			return "B";
		case 7 :
			return "C";
		case 6 :
			return "D";
		default:
			return "F";
		}
		
	}
}
