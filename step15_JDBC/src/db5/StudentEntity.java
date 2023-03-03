package db5;

public class StudentEntity {

	private int num, kor, eng, mat, tot;
	private String name;
	private double avg;
	
	public StudentEntity() {
	}

	public StudentEntity(int kor, int eng, int mat, String name) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.name = name;
		num = 1;
		tot = kor + eng + mat;
		avg = tot / 3.0;
	}

	public StudentEntity(int num, int kor, int eng, int mat, String name) {
		super();
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.name = name;
		tot = kor + eng + mat;
		avg = tot / 3.0;
	}

	public int getNum() {
		return num;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		return tot;
	}

	public String getName() {
		return name;
	}

	public double getAvg() {
		return avg;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
