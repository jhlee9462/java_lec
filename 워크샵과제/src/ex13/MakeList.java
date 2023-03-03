package ex13;

import java.util.ArrayList;

public class MakeList {
	
	ArrayList<Integer> list;

	public MakeList() {
		list = new ArrayList<>();
	}
	
	public void makeArray(int size) {
		for (int i = 0; i < size; i++) {
			list.add((int) (Math.random() * 10 + 10));
		}
	}
	
	public double getAverage() {
		double avg = 0;
		for (int i : list)
			avg += i;
		return avg / list.size();
	}
	
	public ArrayList<Integer> getList() {
		return list;
	}
	
}
