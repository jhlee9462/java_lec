package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name;
		char gender;
		int age;
		double weight;
		float height;
		
		System.out.println("이름을 입력하세요 : ");
		name = br.readLine();
		
		System.out.println("성별을 입력하세요 : ");
		gender = br.readLine().charAt(0);
		// charAt(index) : index 로 주어진 값에 해당하는 문자를 리턴
		// index 가 없으면 공백을 출력
		
		System.out.println("나이를 입력하세요 : ");
		age = Integer.parseInt(br.readLine()); // "23" --> 23
		
		System.out.println("체중을 입력하세요 : ");
		weight = Double.parseDouble(br.readLine());
		
		System.out.println("신장을 입력하세요 : ");
		height = Float.parseFloat(br.readLine());
		
		System.out.println("이름은 " + name + "입니다");
		System.out.println("성별은 " + gender + "자 입니다");
		System.out.println("나이는 " + age + "세 입니다");
		System.out.println("체중은 " + weight + "kg 입니다");
		System.out.println("신장은 " + height + "cm 입니다");
	}

}
