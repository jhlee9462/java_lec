package object;
/* 클래스명 : MemberPhone
 * -name : String
 * -phone : String
 * +input() : void		<== 이름과 전화번호 입력
 * +output() : void		<== 출력
 */

import java.io.IOException;
import java.util.Scanner;

class MemberPhone {
	private String name;
	private String phone;
	
	public void input() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine(); // 줄단위 입력
		System.out.print("전화번호를 입력하세요 : ");
		phone = sc.nextLine();
		sc.close();
	}
	
	public void output() {
		System.out.println(name + " 고객님의 전화번호는 " + phone + "입니다");
	}
}

public class ObjectEx6 {

	public static void main(String[] args) throws IOException {
		MemberPhone mp = new MemberPhone();
		mp.input();
		mp.output();
	}

}
