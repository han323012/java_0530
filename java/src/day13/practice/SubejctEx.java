package day13.practice;


public class SubejctEx {

	public static void main(String[] args) {
		Subejct sub1 =new Subejct("kor",1,1);
		sub1.print();
		System.out.println("============");
		Subejct sub2 =new Subejct("eng",1,1);
		sub2.updateScore(30, 40, 10);
		sub2.print();
		System.out.println("============");
		Subejct sub3 =new Subejct("math",1,1);
		sub3.updateScore(30, 40, 10);
		sub3.print();
	}
}
