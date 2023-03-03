package 자바과제13;

public class ScoreMain {

	public static void main(String[] args) {

		ScoreTable[] scores = new ScoreTable[3];
		
		scores[0] = new ScoreTable("민들래", 5);
		scores[1] = new ScoreTable("진달래", 3);
		scores[2] = new ScoreTable("개나리", 0);
		
		System.out.println("이름\t점수");
		for (int i = 0; i < scores.length; i++) {
			scores[i].calcScore();
			scores[i].printView();
		}
	}

}
