package com.kita.first.practice;

import java.util.Scanner;

public class Practice25 {
	public static void main(String[] args) {
		//콜라 사이다 캔커피 데자와 환타 웰치스
		//900 700 400 500 600 1000
		Scanner scan = new Scanner(System.in);
		
		String menuArr[]={"콜라","사이다","캔커피","데자와","환타","웰치스"};
		int[] priceArr={900,700,400,500,600,1000};
		int num;
		int total=0;
		
		System.out.println("--메뉴--");
		for(int i=0;i<menuArr.length;i++) {
			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
		}
		while(true) {
			System.out.print("메뉴를 입력하세요(0 입력 시 종료)");
			num=scan.nextInt();
			if(num==0) {break;}
			else if(num>6||num<0) 
			{
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			System.out.printf("%s %d원\n",menuArr[num-1],priceArr[num-1]);
			total+=priceArr[num-1];
			}
		scan.close();
		System.out.printf("합계 : %d원",total);
	}
}
