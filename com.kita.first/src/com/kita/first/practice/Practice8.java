package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		//월 입력
		//3~5월 : 봄, 6~8월 :여름, 9~11월 : 가을, 12~2월: 겨울
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String season;
		scan.close();
		
		//String month = scan.next();
		//int monthNum = Integer.parseInt(month);
		if (month>=3&&month<=5) {	
			season ="봄";
		} else if(month>=6 && month<=8) {
			season = "여름";
		} else if(month>=9 && month<=11) {
			season = "가을";
		} else {
			season = "겨울";
		}
		System.out.printf("%d월은 %s입니다.", month, season);
		
		//string으로 받았을때는 case "1": 로 표시
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			season = "겨울";
			break;
		}
		System.out.printf("%d월은 %s입니다.", month, season);
	}
}
