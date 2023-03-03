package test4;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class UserOutputTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/test4/user.txt"));
		String name;
		int age;
		double tall;
		
		System.out.println("입력을 종료하시려면 ctrl+z를 하시오");
		
		do {
			
			System.out.print("Enter your name : ");
			name = br.readLine();
			
			System.out.print("Enter your age : ");
			age = Integer.parseInt(br.readLine());
			
			System.out.print("Enter your tall : ");
			tall = Double.parseDouble(br.readLine());
			
			User user = new User(name, age, tall);
			oos.writeObject(user);
			
			System.out.println("계속 입력하려면 Enter키를 누르시오");
			
		} while (br.readLine() != null);
		
		System.out.println("user.txt파일이 저장 되었습니다.");
		oos.close();
		br.close();
	}

}
