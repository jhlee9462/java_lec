package db4;

import java.util.Scanner;

public class EmpMain {

	Scanner sc = null;
	EmpBiz biz = null;
	EmpEntity entity = null;

	public EmpMain() {
		sc = new Scanner(System.in);
		biz = new EmpBiz();
		entity = new EmpEntity();
	}

	public void menu() {
		String name = null, phone = null, addr = null;
		int n = 0;

		while (true) {
			System.out.println("1. 전체 2. 추가 3. 수정 4. 삭제 5. 검색 6. 종료");
			System.out.print("선택하세요(1-6) : ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				biz.addressList();
				break;
			case 2:
				System.out.print("이름입력 : ");
				entity.setName(sc.next());
				System.out.print("전화입력 : ");
				entity.setPhone(sc.next());
				System.out.print("주소입력 : ");
				entity.setAddr(sc.next());
				
				biz.addressInsert(entity);
				break;
			case 3:
				System.out.print("수정할 사람 이름 : ");
				name = sc.next();
				if (!biz.addressSearch(name)) {
					System.out.println("찾는 사람이 없습니다");
				} else {
					System.out.print("수정할 전화번호 : ");
					phone = sc.next();
					System.out.print("수정할 주소 : ");
					addr = sc.next();
					
					biz.addressUpdate(name, phone, addr);
				} 
				
				break;
			case 4:
				System.out.print("삭제할 사람 이름 : ");
				name = sc.next();
				if (!biz.addressSearch(name)) {
					System.out.println("찾는 사람이 없습니다.");
				} else {
					biz.addressDelete(name);
				}
				
				break;
			case 5:
				System.out.println("찾는 사람 : ");
				name = sc.next();
				
				biz.addressSearch(name);
				break;
			case 6:
				sc.close();
				System.out.println("***** 종료합니다 *****");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new EmpMain().menu();
	}
	
}
