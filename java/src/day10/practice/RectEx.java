package day10.practice;

public class RectEx {

	public static void main(String[] args) {
		//그림판의 사각형을 그리기 위한 클래스를 생성하고 테스트 하는 코드를 작성하세요.
		Rect1 r = new Rect1(0,0,10,10);
		r.print();
		r.move(10, 10);
		r.print();
		r.resize(10, 10, 20, 20);
		r.print();
		r.resize(0, 0, 30, 30);
		r.print();
		
		Rect2 r2 =new Rect2(new Point(0,0), new Point(10,10));
		r2.print();
		r2.move(0,0);
		r2.print();
		r2.resize(10, 10, 20, 20);
		r2.print();
		r2.resize(0, 0, 30, 30);
	}

}
//그림판의 사각형을 그리기 위한 클래스
class Rect1{
	
	//맴버변수
	private int leftUpX, leftUpY;
	private int rightDownX, rightDownY;
	//a = x1;
	//b = y1;
	//c = x2;
	//d = y2;
	
	//생성자
	public Rect1(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		this.leftUpX = leftUpX;
		this.leftUpY = leftUpY;
		this.rightDownX = rightDownX;
		this.rightDownY = rightDownY;
	}

	//메서드
	/**사각형 정보를 출력하는 메서드
	 * 매개변수
	 * 리턴타입
	 * 메서드명 print
	 */
	public void print() {
	System.out.println("====================");
	System.out.println(leftUpX + "," + leftUpY);
	System.out.println(rightDownX + "," + rightDownY);
	}
	
	/** 사각형을 이동시키는 메서드
	 * 매개변수 
	 * 리턴타입
	 * 메서드명
	 */
	public void move(int x, int y) {
		int dx = leftUpX - x;//이동한 x거리 -10
		int dy = leftUpY - y;//이동한 y거리 -10
		 leftUpX = x;
		 leftUpY = y;
		 rightDownX = rightDownX - dx;
		 rightDownY = rightDownY - dy;
	}
	/**사각형의 크기를 변경하는 메서드
	 * 매개변수 변경된 사각형의 왼쪽 위의 x,y좌표와 가로세로가 주어지면 사각형의 크기를 변경하는 메서드
	 * 리턴타입
	 * 메서드명 resize
	 */
	public void resize(int x, int y ,int w ,int h ) {
		leftUpX = x;
		leftUpY = y;
		rightDownX = x + w;
		rightDownY = y + h;
		
		
	}
}
class Rect2{
	//맴버변수
	private Point leftUp, rightDown;
	
	//생성자
	public Rect2(Point leftUp, Point rightDown) {
		super();
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	}
	public Rect2(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		leftUp = new Point(leftUpX, leftUpY);
		rightDown = new Point(rightDownX, rightDownY);
	}
	//메서드
		/**사각형 정보를 출력하는 메서드
		 * 매개변수
		 * 리턴타입
		 * 메서드명 print
		 */
		public void print() {
		System.out.println("====================");
		System.out.println("lu point");
		leftUp.print();
		System.out.println("rd point");
		rightDown.print();
		}
		/** 사각형을 이동시키는 메서드
		 * 매개변수 
		 * 리턴타입
		 * 메서드명
		 */
		public void move(int x, int y) {
			int dx = leftUp.getX() - x;//이동한 x거리 -10
			int dy = leftUp.getY() - y;//이동한 y거리 -10
			 leftUp.move(x, y);
			 rightDown.move(rightDown.getX()-dx,rightDown.getY() -dy);
		}
		/**사각형의 크기를 변경하는 메서드
		 * 매개변수 변경된 사각형의 왼쪽 위의 x,y좌표와 가로세로가 주어지면 사각형의 크기를 변경하는 메서드
		 * 리턴타입
		 * 메서드명 resize
		 */
		public void resize(int x, int y ,int w ,int h ) {
			leftUp.move(x, y);
			rightDown.move(x+w, y+h);
		}
			
	
}
