package example20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] score = new double[Integer.parseInt(args[0])];
		double total = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("score[" + i + "]를 입력하시오 : ");
			score[i] = Double.parseDouble(br.readLine());
			total += score[i];
		}
		
		System.out.printf("평균 : %.2f\n", total / score.length);
	}

}
