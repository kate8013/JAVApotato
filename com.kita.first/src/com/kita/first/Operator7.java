package com.kita.first;

public class Operator7 {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		String str3 = new String("안녕");
		boolean result2 = (str1 == str2);
		System.out.println(result2);
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.contentEquals(str3));
	}
}
