package com.kita.first.practice;

public class Practice15 {
	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int star = 4;
		for(int i = 1;i<=star*star;i++) {
			System.out.print("*");
			if(i%star==0) {
				System.out.println();
			}
		}
		for(int z=1; z<5;z++) {
			for(int x=0; x<z;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
