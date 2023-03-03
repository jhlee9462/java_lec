package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) {

//		객체 역직렬화
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("storage/user.txt"));
			
			UserInfo ob1 = (UserInfo) ois.readObject();
			UserInfo ob2 = (UserInfo) ois.readObject();
			ob1.disp();
			ob2.disp();
			
			ois.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		객체 직렬화 : IO stream 을 만든다.
//		UserInfo ob1 = new UserInfo("진달래", 23, 89.5);
//		UserInfo ob2 = new UserInfo("민들래", 23, 98.5);
//		
//		try {
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("storage/user.txt"));
//			
//			oos.writeObject(ob1);
//			oos.writeObject(ob2);
//			
//			oos.close();
//			System.out.println("객체가 저장 되었습니다.");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
