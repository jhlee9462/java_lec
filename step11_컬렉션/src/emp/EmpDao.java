package emp;

import java.util.ArrayList;
import java.util.List;

// DAO(data access object)
// 데이터베이스에서 데이터를 가지고 오거나 저장하는 용도로 사용하는 객체.
public class EmpDao {

	List<EmpVO> list = null; // null 로 선언하기
	
	public EmpDao() {
		list = new ArrayList<>();
		list.add(new EmpVO("뽀로로", "개발부", 1000000));
		list.add(new EmpVO("크롱", "영업부", 2000000));
		list.add(new EmpVO("패티", "개발부", 1000000));
	}
	
	public List<EmpVO> getEmpList() {
		return list;
	}

	public EmpVO getEmp(String name) {
		for (EmpVO vo : list) {
			if (vo.getName().equals(name))
				return vo;
		}
		return null;
	}
	
}
