package day10.thisex;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println(Student1.studentCount);
		
		Student1 std1 = new Student1(1,1,1,"홍길동");
		System.out.println(Student1.studentCount);
		
		Student1 std2 = new Student1(1,1,2,"임꺽정");
		System.out.println(Student1.studentCount);
		
		//std2.studentCount =1;
		//System.out.println(std1.studentCount);
		//Student1.print(); 에러발생
		std1.print();
		std2.print();
		System.out.println(std1);
		System.out.println(std2);
		
	}

}
class Student1{
	static int studentCount;
	private int grade, classNum, number;
	private String name;
	//아래 생성자는 매개변수가 있고, 매개변수의 이름이 맴버변수와 같이 때문에
	//맴버 변수를 호출할 때 this를 반드시 붙여야함
	public Student1(int grade, int classNum, int number, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;
	}
	public void print() {
		System.out.println("=================");
		System.out.println(grade);
		System.out.println(classNum);
		System.out.println(name);
		System.out.println(studentCount);
		//printCount();
	}
	public static void printCount() {
		System.out.println(studentCount);
		//print();
		Student1 std1 = new Student1();
		std1.name = "hong";
		std1.print();
	}
	
	//기본 생성자는 매개변수가 없기 때문에 this를 안써도 됨
	public Student1() {}
		//맴버변수와 이름이 같은 지역 변수를 만들수도 있다 (비추)
		//int grade =10;
		//this.grade =grade;
		//아래 디스 생성자 편하네
		//this(1,1,1,"");
		/*grade =1;
		classNum =1;
		number =1;
		name ="";
		*/
	
}