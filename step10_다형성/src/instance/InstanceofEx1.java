package instance;

// instanceof 를 이용한 연산의 결과가 true 일 경우 참조변수가 검사한 타입으로 형변환이 가능함

class Government {}

class Education extends Government {}

class Justice extends Government {}

public class InstanceofEx1 {

	public static void main(String[] args) {
		Government gov = new Government();
		Education edu = new Education();

		// 상속관계에서 검사
		System.out.println(edu instanceof Government); // true
		// edu 객체가 Government 타입으로 형변환이 가능한가?
		System.out.println(gov instanceof Justice); // false
//		System.out.println(edu instanceof Justice); // error : 상속관계가 아니기 때문에
	}

}
