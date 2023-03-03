package ifex;
// 중첩 if 문 : if 문이 여러번 사용되는 구조
public class IfEx2 {

	public static void main(String[] args) {

		int age = 23;
		
		if (age <= 19) {
			System.out.println("애들은 가라~");
			
		} else {
			if (age >= 30) {
				System.out.println("국빈관으로 가세요~");
			} else {
				System.out.println("환영합니다... 즐거운 시간 보내세요");
			}
		}
	}

}
