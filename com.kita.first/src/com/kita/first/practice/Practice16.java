package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String menu;
		do {
			int rNum = (int)(Math.random()*6)+1;
			switch(rNum) {
			case 1:
				menu = "떡볶이";
				break;
			case 2:
				menu = "돈가스";
				break;
			case 3: case 4:
				menu = "치킨";
				break;
			default:
				menu = "파스타";
				break;
			}
			System.out.printf("뽑힌 메뉴 : %s\n", menu);
			System.out.print("마음에 듭니까?(Y/N)");
			String result = scan.next();
			if("Y".equals(result)) {
				break;
			}
		} while (true);
		scan.close();
		System.out.printf("오늘의 메뉴는 %s입니다",menu);
	}
}
