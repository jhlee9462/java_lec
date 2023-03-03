package family;
/* 이름 : 홍길동			<== Family 의 toString() 에서 작성
 * 아빠는 나가서 일을 한다	<== Job 인터페이스를 구현해서 work() 에서 작성
 * 
 * 이름 : 카리나
 * 엄마는 집안일을 한다
 * 
 * 이름 : 홍준표
 * 아들은 공부를 한다
 */
// 객체 배열 사용하여 객체 생성 후 출력
public class MainEx {

	public static void main(String[] args) {
		
		Object[] objects = { new Father("홍길동"), new Mother("카리나"), new Son("홍준표") };
		
		for (int i = 0; i != objects.length; i++) {
			
			Job job = (Job) objects[i];
			
			System.out.println(objects[i]);
			System.out.println(job.work());
			System.out.println();
			
		}
	}

}
