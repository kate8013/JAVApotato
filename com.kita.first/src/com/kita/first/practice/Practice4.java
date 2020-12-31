package com.kita.first.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num = scan.nextInt();
		String isOdd = "짝수";
		if(num%2==1) {
			isOdd = "홀수";
		}
		System.out.printf("%d는 %s입니다.",num,isOdd);
		
		
		
		
	}
}
