package db5;

public class StudentBiz {
	
	private StudentDao sd = new StudentDao();
	private StudentView sv = new StudentView();

	public void insertStudent(StudentEntity entity) {
		int kor = entity.getKor();
		int eng = entity.getEng();
		int mat = entity.getEng();
		
		if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || mat < 0 || mat > 100) {
			throw new NumberFormatException();
		}
			
		sv.insertStudent(sd.insertStudent(entity));
	}
	
	public void getStudent(String name) {
		sv.getStudent(sd.getStudent(name));
	}
	
	public void getStudentList() {
		sv.getStudentList(sd.getStudentList());
	}
	
}
