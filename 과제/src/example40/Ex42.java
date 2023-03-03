package example40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Health {
	public char gender;
	public double tall, weight;
	
	public Health() {
	}
	
	public void input() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("성별(M/F)을 입력하시오: ");
		gender = br.readLine().charAt(0);
		System.out.print("신장(Cm)을 입력하시오: ");
		tall = Double.parseDouble(br.readLine());
		System.out.print("체중(Kg)을 입력하시오: ");
		weight = Double.parseDouble(br.readLine());
		
		System.out.println();
	}
	
	public String output() {
		return "성별: " + gender + "\n신장: " + tall + "Cm\n체중: " + weight + "Kg\n"; 
	}
}

class Test42 extends Health {
	private double fat;
	private String result;
	
	public Test42() throws NumberFormatException, IOException {
		super.input();
	}
	
	public void calculate() {
		double stdWeight = 0;
		
		if (gender == 'F') {
			stdWeight = (tall - 100) * 0.85;
		} else if (gender == 'M') {
			stdWeight = (tall - 100) * 0.9;
		} else {
			System.out.println("성별이 올바르지 않습니다.");
			System.exit(0);
		}
		
		fat = weight / stdWeight * 100;
		
		if (fat <= 90) {
			result = "저체중";
		} else if (fat <= 110) {
			result = "정상(표준체중)";
		} else if (fat <= 120) {
			result = "과체중";
		} else if (fat <= 130) {
			result = "경도비만";
		} else if (fat <= 150) {
			result = "중도비만";
		} else {
			result = "고도비만";
		}
	}
	
	@Override
	public String output() {
		System.out.println("**비만도 측정 결과**");
		calculate();
		return super.output() + "결과: 당신은 비만도 " + String.format("%.2f", fat) + "이고 " + result + " 입니다.";
	}
}

public class Ex42 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Test42 ob = new Test42();
		System.out.println(ob.output());
	}

}
