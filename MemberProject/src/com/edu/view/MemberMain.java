package com.edu.view;

import java.util.Scanner;

import com.edu.controller.MemberController;
import com.edu.entity.MemberEntity;

public class MemberMain {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		MemberController mc = new MemberController();
		MemberView mv = new MemberView();

		while (true) {
			System.out.println("1.추가 2.삭제 3.전체보기 4.찾기 5.종료");
			System.out.print("선택(1~5) : ");
			int choice = Integer.parseInt(sc.next());
			String name = null, phone = null;
			
			switch (choice) {
			case 1:
				System.out.print("이름: ");
				name = sc.next();
				System.out.print("전화: ");
				phone = sc.next();
				mc.insertMember(new MemberEntity(mv.nextSeq(), name, phone));
				break;
			case 2:
				System.out.print("이름: ");
				name = sc.next();
				mc.DeleteMember(name);
				break;
			case 3:
				mc.getMemberList();
				break;
			case 4:
				System.out.print("이름: ");
				name = sc.next();
				mc.getMember(name);
				break;
			case 5:
				System.out.println("*** 작업끝 ****");
				sc.close();
				System.exit(0);
			}
		}
	}

}
