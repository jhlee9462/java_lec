package db5;

import java.util.List;

public class StudentView {

	public void insertStudent(String name) {
		System.out.println(name);
	}

	public void getStudent(StudentEntity entity) {
		if (entity != null)
			System.out.println("이름 : " + entity.getName() + " 총점 : " + entity.getTot() + " 평균 : "
					+ String.format("%.2f", entity.getAvg()));
		else
			System.out.println("데이터 찾기에 실패했습니다.");
	}

	public void getStudentList(List<StudentEntity> list) {
		if (list != null) {
			for (StudentEntity entity : list) {
				System.out.println("이름 : " + entity.getName() + " 국어 : " + entity.getKor() + " 영어 : " + entity.getEng()
						+ " 수학 : " + entity.getMat() + " 총점 : " + entity.getTot() + " 평균 : "
						+ String.format("%.2f", entity.getAvg()));
			}
		} else {
			System.out.println("데이터가 없습니다.");
		}
	}

}
