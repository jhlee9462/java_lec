package db5;

import java.util.Scanner;

public class StudentMain {

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		StudentBiz sb = new StudentBiz();
		StudentEntity entity = null;
		
		while (true) {
			System.out.println("1.추가 2.검색 3.전체보기 4.종료");
			System.out.print("선택(1~4) : ");
			ch = Integer.parseInt(sc.next());
			
			switch (ch) {
			case 1:
				entity = new StudentEntity();
				System.out.print("이름을 입력 : ");
				entity.setName(sc.next());
				System.out.print("국어점수 입력 : ");
				entity.setKor(Integer.parseInt(sc.next()));
				System.out.print("영어점수 입력 : ");
				entity.setEng(Integer.parseInt(sc.next()));
				System.out.print("수학점수 입력 : ");
				entity.setMat(Integer.parseInt(sc.next()));
				
				try {
					sb.insertStudent(entity);
				} catch (NumberFormatException e) {
					System.out.println("점수 입력 오류!! 다시 입력하시오");
				}
				
				break;
			case 2:
				String name = null;
				System.out.print("이름을 입력하시오 : ");
				name = sc.next();
				
				sb.getStudent(name);
				
				break;
			case 3:
				sb.getStudentList();
				
				break;
			case 4:
				sc.close();
				System.out.println("** 고생 하셨습니다 **");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		menu();
	}

}
