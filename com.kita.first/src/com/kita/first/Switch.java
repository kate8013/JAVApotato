package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		int rNum = (int)(Math.random()*6)+1;
		String menu;
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
		System.out.println(menu);
		
	}
}
