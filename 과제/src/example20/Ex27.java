package example20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String item;
		int qty = 0, price = 0;
		
		System.out.print("품명을 입력하시오 : ");
		item = br.readLine();
		System.out.print("수량을 입력하시오 : ");
		qty = Integer.parseInt(br.readLine());
		System.out.print("단가를 입력하시오 : ");
		price = Integer.parseInt(br.readLine());
		
		compute(item, qty, price);
		
	}
	
	public static void compute(String item, int qty, int price) {
		System.out.println("품명 : " + item);
		System.out.println("금액 : " + (qty * price) + "원");
	}

}
