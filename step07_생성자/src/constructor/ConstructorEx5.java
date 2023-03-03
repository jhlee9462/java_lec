package constructor;
/* 문제. 생성자에서 두 수를 입력 받아서 큰수와 작은수를 출력하세요
 * show() 에서 maxValue(), minValue() 를 호출하세요
 * 
 * 클래스명 : Max
 * -a : int
 * -b : int
 * +Max()
 * +maxValue() : int
 * +minValue() : int
 * +show() : void
 * 
 * -- 출력결과 --
 * Input a : 5
 * Input b : 3
 * 
 * 큰수 : 5
 * 작은수 : 3
 * 
 */
public class ConstructorEx5 {

	public static void main(String[] args) {
		new Max().show();
	}

}
