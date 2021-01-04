package com.kita.first.practice;

import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		System.out.println("점수를 입력해 주세요: (0~100)");
		Scanner scan = new Scanner(System.in);
		String score = scan.next();
		String grade;
		scan.close();
		
		int num = Integer.parseInt(score);
		
		if(num>100||num<0) {
			grade = "잘못 입력하셨습니다.";
			return;
		} else if(num<70) {
			grade = "D";
		} else if (num<80) {
			grade = "C";
		} else if (num<90) {
			grade = "B";
		} else {
			grade = "A";
		}
		System.out.print(grade);
		
		int mod = num%10;
		if (mod>=7) {
			System.out.println("+");
		} else if(mod<=3) {
			System.out.println("-");
		}
	}
}
