package 자바과제9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class PayTable extends Salary implements Calculate, Output {

	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
		// TODO Auto-generated constructor stub
	}

	public void title() {
		System.out.println("                        **** 급여명세서 ****");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("이름\t기본급\t가족수\t가족수당\t시간외근무\t시간외수당\t세금\t인센티브(%)\t성과금\t실수령액");
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
	
	public void footer() { // 정수형의 static 필드 하나를 추가할 수 있다면 생성자가 호출될 때마다
		// 1을 더해서 총 인원수를 하드코딩하지 않아도 되지만 문제에 추가적인 필드를 선언해도 된다는
		// 말이 없으므로 그냥 하드코딩함.
		System.out.println("인원수 : 3명");
	}
	
	@Override
	public void out() {
		calc();
		DecimalFormat df = new DecimalFormat("###,###원");
		System.out.print(getName() + "\t" + df.format(getPay()) + "\t" + getFamily() + "\t");
		System.out.print(df.format(getFamily_p()) + "\t" + getOvertime() + "\t" + df.format(getOvertime_p()) + "\t");
		System.out.print(df.format(getTax()) + "\t" + (getIncentive() * 100) + "\t\t" + df.format(getIncen_p()) + "\t");
		System.out.println(df.format(getTotal_pay()));
	}

	@Override
	public void calc() {
		if (getFamily() < 3)
			setFamily_p(getFamily() * 20000);
		else
			setFamily_p(60000);
		
		setOvertime_p(getOvertime() * 5000);
		
		setTax(getPay() / 10);
		
		setIncen_p((int) (getIncentive() * getPay()));
		
		setTotal_pay(getPay() + getFamily_p() + getIncen_p() + getOvertime_p() - getTax());
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		PayTable[] pt = new PayTable[3];
		pt[0] = new PayTable("소서노", 750000, 2, 3);
		pt[1] = new PayTable("고주몽", 800000, 1, 4);
		pt[2] = new PayTable("모팔모", 650000, 6, 2);
		
		pt[0].title();
		for (PayTable payTable : pt) {
			payTable.out();
		}
		pt[0].footer();
		
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("인센티브(%)입력:");
		float incentive = Float.parseFloat(br.readLine());
		PayTable.setIncentive(incentive);
		
		pt[0].title();
		for (PayTable payTable : pt) {
			payTable.out();
		}
		pt[0].footer();
	}

}
