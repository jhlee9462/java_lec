package object;
/* -base:int
 * -top:int
 * -height:int
 * 
 * +setTrapezoid(base:int, top:int, height:int):void
 * +calc():double		<== 사다리꼴의 넓이를 구해서 리턴
 * +toString():String
 * 
 */
// 사다리꼴의 넓이 = (윗변 + 아랫변) / 2 * 높이  
public class Trapezoid {
	private int base, top, height;
	
	public void setTrapezoid(int base, int top, int height) {
		this.base = base;
		this.top = top;
		this.height = height;
	}
	
	public double calc() {
		return (top + base) * height / 2.0;
	}
	
	// toString() : 출력 문장 만들기
	@Override
	public String toString() {
		return "넓이 : " + calc(); 
	}
}
