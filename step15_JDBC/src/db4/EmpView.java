package db4;

import java.util.List;

public class EmpView {

	public void addressList(List<EmpEntity> list) {
		if (list != null) {
			for (EmpEntity entity : list) {
				System.out.println(entity.getNum() + "\t" + entity.getName() + "\t" + entity.getPhone() + "\t" + entity.getAddr());
			}
		} else {
			System.out.println("출력할 데이터가 없습니다.");
		}
	}

	public void addressInsert(int n) {
		if (n > 0) {
			System.out.println(n + "건의 데이터를 추가했습니다.");
		} else {
			System.out.println("데이터 추가에 실패했습니다.");
		}
	}

	public void addressSearch(EmpEntity entity) {
		if (entity != null)
			System.out.println(entity.getNum() + "\t" + entity.getName() + "\t" + entity.getPhone() + "\t" + entity.getAddr());
		else
			System.out.println("찾는 사람이 없습니다.");
	}

	public void addressUpdate(int n) {
		if (n > 0)
			System.out.println(n + "건의 데이터를 수정했습니다.");
		else
			System.out.println("데이터 수정에 실패했습니다.");
	}

	public void addressDelete(int n) {
		if (n > 0)
			System.out.println(n + "건의 데이터를 삭제했습니다.");
		else
			System.out.println("데이터 삭제에 실패했습니다.");
	}

}
