package example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		char gender;
		int age;
		double tall;
		
		System.out.println("Input name: ");
		name = br.readLine();
		System.out.println("Input gender: ");
		gender = br.readLine().charAt(0);
		System.out.println("Input age: ");
		age = Integer.parseInt(br.readLine());
		System.out.println("Input tall: ");
		tall = Double.parseDouble(br.readLine());
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + ((gender == 'M')? "남자" : "여자"));
		System.out.println("나이 : " + age + "세");
		System.out.printf("신장 : %.1fcm\n", tall);
	}
	
}
