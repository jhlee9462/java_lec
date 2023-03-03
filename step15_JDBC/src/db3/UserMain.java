package db3;

import java.util.List;

public class UserMain {

	public static void main(String[] args) {

		UserDao dao = new UserDao();
		
		// 전체보기
		List<UserEntity> list = dao.userList();
		for (UserEntity entity : list) {
			System.out.print(entity.getNum() + "\t");
			System.out.print(entity.getId() + "\t");
			System.out.print(entity.getPasswd() + "\t");
			System.out.print(entity.getName() + "\t");
			System.out.println(entity.getScore());
		}
		
		System.out.println();
		
		// bb 의 모든 데이터 출력
		UserEntity entity = dao.selectUser("bb");
		System.out.print(entity.getNum() + "\t");
		System.out.print(entity.getId() + "\t");
		System.out.print(entity.getPasswd() + "\t");
		System.out.print(entity.getName() + "\t");
		System.out.println(entity.getScore());
		
		// 데이터 추가하기
		
		int n = dao.insertUser(new UserEntity("cc", "2222", "park", 88.9));
		if (n > 0) {
			System.out.println(n + "건의 데이터가 추가 되었습니다.");
		} else {
			System.out.println("데이터 추가에 실패하였습니다.");
		}
	}

}
