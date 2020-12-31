package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		//1~6 총 6개의 메뉴 랜덤 뽑기
		int num = (int)(Math.random()*6)+1;
		String menu;
		if(num==1) {
			menu = "라면";
		} else if(num==2){
			menu = "치킨";
		} else if (num==3) {
			menu = "피자";
		} else if(num==4) {
			menu = "초밥";
		} else if(num==5) {
			menu = "떡볶이";
		} else {
			menu = "덮밥";
		}
		System.out.println(menu);
		
	}
}
