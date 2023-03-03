package switchex;

/* args 로 입력된 month 로 날짜를 구하세요
 * $ java SwitchEx3 3
 * 
 * -- 출력 결과 --
 * 3 월은 31 일까지 있습니다
 * 
 */
public class SwitchEx3 {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int day = 0; // 0 으로 초기화

		switch (month) {
		case 2:
			day = 28;
			break;
			
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
			
		default:
			System.out.println("달은 1 월부터 12 월까지 있으므로 맞는 달을 입력해주세요");
			break;
		}
		
		System.out.println(month + " 월은 " + day + " 일까지 있습니다");
	}

}
