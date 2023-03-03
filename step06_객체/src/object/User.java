package object;

/* - private, + public, # protected
 * 
 * 클래스명 : User
 * +name : String
 * +k : int
 * +e : int
 * +m : int
 * 
 * +setUser(n:String, k:int, e:int, m:int):void
 * +getTotal():int
 * +getUser():String
 * 
 */

public class User {
	
	public String name;
	public int k, e, m;
	
	public void setUser(String n, int k, int e, int m) {
		name = n;
		this.k = k;
		this.e = e;
		this.m = m;
	}
	
	public int getTotal() {
		return k + e + m;
	}
	
	public String getUser() {
		return "이름은 " + name + "이고 총점은 " + getTotal() + "점입니다";
	}
	
}
