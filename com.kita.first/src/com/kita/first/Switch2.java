package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sNum = sc.next();
		String menu;
		sc.close();
		
		switch(sNum) {
		case "일":
			menu = "떡볶이";
			break;
		case "이":
			menu = "돈가스";
			break;
		case "삼": case "사":
			menu = "치킨";
			break;
		default:
			menu = "파스타";
			break;
		}
		System.out.println(menu);
	}
}
