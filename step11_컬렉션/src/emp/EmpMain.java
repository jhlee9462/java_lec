package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {

		EmpDao dao = new EmpDao();
		System.out.println("***** 모든 사원 출력하기 *****");

		List<EmpVO> list = dao.getEmpList();

		for (EmpVO ob : list) {
			System.out.print("이름 : " + ob.getName());
			System.out.print("\t부서 : " + ob.getDept());
			System.out.println("\t급여 : " + ob.getSalary());
		}
		

		System.out.println("***** 크롱 사원 출력하기 *****");

		EmpVO em = dao.getEmp("크롱");
		if (em == null) {
			System.out.println("찾는 사람이 없습니다");
		} else {
			System.out.print("이름 : " + em.getName());
			System.out.print("\t부서 : " + em.getDept());
			System.out.println("\t급여 : " + em.getSalary());
		}
	}

}
