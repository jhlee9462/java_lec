package methodex;

public class Temp {

	public static void view(String[] ca) {
		
		for (String data : ca)
			System.out.print(data + " ");
		System.out.println();
		
		ca[1] = "모닝";
	}
	
	public static void main(String[] args) {
		String[] car = { "아반떼", "티코", "스파크" };
		view(car);
		
		for (String data : car)
			System.out.print(data + " ");
		System.out.println();
	}

}
