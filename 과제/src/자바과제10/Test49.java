package 자바과제10;

public class Test49 extends Profile implements Score, Display {

	private int score;
	
	public Test49(String name, String phone, int score) {
		super(name, phone);
		// TODO Auto-generated constructor stub
		this.score = score;
	}

	public static void main(String[] args) {
		
		Test49 ob = new Test49("홍길동", "123-4567", 5);
		ob.display();
		
	}

	@Override
	public void display() {
		super.printView();
		scoreResult(num);
	}

	@Override
	public void scoreResult(int sol) {
		System.out.println("점수: " + score * sol);
	}

}
