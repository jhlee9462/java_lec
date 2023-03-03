package array;
// 1 차원 배열
public class ArrayEx2 {

	public static void main(String[] args) {
		String[] car = { "소나타", "코란도", "스파크", "모닝", "아반떼" };
		car[3] = "티코";
		
		for (int i = 0; i < car.length; i++)
			System.out.println(car[i]);
		
		System.out.println("----------------------------");
		// 역순으로 출력
		
		for (int i = 0; i < car.length; i++)
			System.out.println(car[car.length - i - 1]);
		
		System.out.println("----------------------------");
		// 향상된 for 문
		
		for (String e : car)
			System.out.println(e);
	}

}
