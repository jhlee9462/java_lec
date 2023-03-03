package test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserInputTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/test4/user.txt"));
		
		while (true) {
			try {
				User user = (User) ois.readObject();
				System.out.println(user.toString());
			} catch (ClassNotFoundException | IOException e) { // ClassNotFoundException 대신에 EOFException을 사용해도 된다. (파일의 끝에 도달했을 때 break 되도록)
				break;
			}
		}
		
		ois.close();
	}

}
