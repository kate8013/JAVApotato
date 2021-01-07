package com.kita.first.practice;

public class Practice22 {
	public static void main(String[] args) {
		//정수 배열 만들어서 1~100까지 값을 각 배열 안에 넣고 출력
		int[] arr = new int[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			} 
		}
	}
}
