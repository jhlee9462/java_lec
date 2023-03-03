package ex7;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {

		HashMap<Integer, Employee> map = new HashMap<>();
		
		map.put(1, new Secretary("Hilery", "secretary", 1, 800));
		map.put(2, new Sales("Clinten", "sales", 2, 1200));
		
		System.out.println("name\tdepartment\tsalary");
		System.out.println("------------------------------");
		for (int i = 1; i <= map.size(); i++) {
			Employee temp = map.get(i);
			System.out.println(temp.getName() + "\t" + temp.getDepartment() + "\t" + temp.getSalary());
		}
		System.out.println();
		
		for (int i = 1; i <= map.size(); i++) {
			((Bonus) map.get(i)).incentive(100);
		}
		System.out.println("인센티브 100 지급");
		System.out.println();
		
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("------------------------------");
		for (int i = 1; i <= map.size(); i++) {
			Employee temp = map.get(i);
			System.out.println(temp.getName() + "\t" + temp.getDepartment() + "\t" + temp.getSalary() + "\t" + temp.tax());
		}
		System.out.println();
	}

}
