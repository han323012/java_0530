package day3.operateor;

public class ConditionalEx {

	public static void main(String[] args) {
		//나이가 20이상이면 성인, 아니면 미성년자를 출력하는 코드를 작성하세요.
		int age = 25;
		String str;
		
		str = age >= 20 ? "adult" : "minor"; // 쓰면 편한 공식 (조건식)
			System.out.println(age + " years old is a " + str);
	}

}
