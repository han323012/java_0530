package day3.operateor;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 85;
		//성적이(score)이 80점 이상이고 90점 미만인가?
		//score가 80보다 크거나 같고 90보다 작다
		//score가 80보다 크거나 같다 && score가 90보다 작다
		//score가 >=80 && score < 90
		System.out.println( "Is " + score + "점은 B학점인가? " + ( score >= 80 && score < 90));
		int age = 21;
		//20세 이상이면 성인
		//
		boolean isAdult = age >= 20;
		// agv살은 미성년자인가?
		System.out.println("Is" + " "+ age + " " + "years old a minor?" + " " + !isAdult);
		//붙어있는게 거슬려서 " " 집어넣기
		
		//주민등록증은 있고, 운전면허증이 없음
		boolean hasidCard = true;
		boolean hasDriverCard = false;
		//토익을 볼 수 있으까요? (주민등록증이 있거나 운전면허증이 있으면 볼 수 있음)
		System.out.println("Can I Take TOEIC?" + " " + ( hasidCard || hasDriverCard ) );
		//붙어있는게 거슬려서 " " 집어넣기

	}

}
