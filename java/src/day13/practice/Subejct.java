package day13.practice;

import lombok.Data;

@Data
public class Subejct {
	//맴버변수
	private String title;	//과목명 국어 영어 수학
	private double total;   //과목의 총점 
	private double average;
	private double midTerm;   
	private double finalTerm;   
	private double performance;   
	private int grade;
	private int semester;
	//생성자
	public Subejct(String title) {
		this.title = title;
	}
	public Subejct(String title, int grade, int semester) {
		super();
		this.title = title;
		this.grade = grade;
		this.semester = semester;
	}
	//메서드
	/**중간고사 성적 추가/수정 setMidTerm*/
	
	/**기말고사 성적 추가/수정setFinalTerm*/
	
	/**수행평가 성적 추가/수정setPerformance*/
	
	/**전체 성적 추가*/
	public void updateScore(int midTerm,int finalTerm,int performance) {
		this.midTerm = midTerm;
		this.finalTerm =finalTerm;
		this.performance = performance;
		total = midTerm + finalTerm+  performance;
		average = total/3;
	}
	/**성적출력 */
	public void print() {
		System.out.println("title " +title);
		System.out.println("grade " +grade);
		System.out.println("semester " +semester);
		System.out.println("mid " +midTerm);
		System.out.println("final " +finalTerm);
		System.out.println("perform " +performance);
		System.out.println("total " +total);
	}
		

}
