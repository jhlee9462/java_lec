package step01_기초;

// 주석(comment) : 싱글라인 주석 Ctrl + /
/* Ctrl + Shift + /
  멀티라인 주석
  주석
  ;;; 
*/

// 한줄 삭제 : Ctrl + d

/* ` 그레이브
 * ' 어포스트로피
 * ^ 캐럿
 * & 앰퍼샌드
 * * 애스터리스크
 * () 패런thㅔ시스
 * \ 역슬래시
 * | 파이프 (필기를 할 때는 가운데를 비우고 두 줄로 표시한다.)
 * {} 브레이스
 * [] 스퀘어 브라켓
 * <> 앵글 브라켓
 */

public class HelloJava {

	public static void main(String[] args) {
		System.out.println("이름은 홍길동입니다");
		System.out.println("사는곳은 강남입니다");
		System.out.println("나이는 23세 입니다");
		// 실행 Ctrl + F11
		
		// 문자열에서 엔터를 치면 알아서 " 와 + 로 이어준다.
		System.out.println("이름은 홍길동입니다\n"
				+ "사는곳은 강남입니다\n나이는 23세 입니다");
		System.out.println("Hello java\n");
		System.out.println("Hello oracle\n");
	}
}
