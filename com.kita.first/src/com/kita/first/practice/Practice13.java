package com.kita.first.practice;

public class Practice13 {
	public static void main(String[] args) {
		//2~9단
		for(int i =2; i<10; i++) {
			for(int j =1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			if(i<9) { System.out.println(); }
		}
		
	}
	
	
}
