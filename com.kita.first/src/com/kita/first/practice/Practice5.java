package com.kita.first.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수학 응시 유형을 입력해주세요 : ");
		String type = sc.next();
		int dS = 70;
		
		if ("가".equals(type)||"나".equals(type)) {
			System.out.print("점수를 입력해주세요 : ");
			int score = sc.nextInt();
			
			if("가".equals(type)) {
				dS = 60;
			}
			if(score>dS) {
				System.out.println("평균 초과입니다.");
			}
			else if(score<dS) {
				System.out.println("평균 미만입니다.");
			}
			else {
				System.out.println("평균입니다.");
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	}
}
