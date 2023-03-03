package interfaceex;

/* 
 * 클래스와 인터페이스를 이용한 성적 처리
 * 클래스명 : User
 * -name : String
 * +User()
 * +User(name : String)
 * +toString() : String
 * 
 * 인터페이스명 : Score
 * +sol : int(초기값 : 20)	<== 배점
 * +getScore() : int		<== 맞은수 * 배점
 * 
 * 인터페이스명 : Print
 * +toPrint() : String
 * 
 * -- 출력결과 --
 * 이름 : 뽀로로
 * 점수 : 60점
 */

class User {
	
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name) {
		super();
		this.name = name;
	}
	
	public String toString() {
		return "이름 : " + name;
	}
}

interface Score {
	
	public int sol = 20;
	
	public int getScore();
	
}

interface Print {
	
	public String toPrint();
	
}

public class InterfaceEx4 extends User implements Score, Print {
	
	public static void main(String[] args) {
		
		System.out.println(new InterfaceEx4("뽀로로", 3).toPrint());
		
	}
	
	private int correct;
	
	public InterfaceEx4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InterfaceEx4(String name, int correct) {
		super(name);
		this.correct = correct;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toPrint() {
		return toString() + "\n점수 : " + getScore() + "점";
	}

	@Override
	public int getScore() {
		return sol * correct;
	}

}
