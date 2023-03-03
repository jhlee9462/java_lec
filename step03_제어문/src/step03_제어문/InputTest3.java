package step03_제어문;

/* 이름 : 진달래
 * 성별 : 여
 * 나이 : 23
 * 
 * 이름은 진달래입니다
 * 성병은 여자입니다
 * 나이는 23세입니다
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputTest3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		char gender;
		int age;
		
		System.out.println("이름 : ");
		name = br.readLine();
		System.out.println("성별 : ");
		gender = br.readLine().trim().charAt(0);
		System.out.println("나이 : ");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("이름은 " + name + "입니다");
		System.out.println("성별은 " + gender + "자 입니다");
		System.out.println("나이는 " + age + "세 입니다");
	}

}
