package com.kita.first.practice;

public class Practice28 {
	public static void main(String[] args) {
		int[][] arr= {
				{90,100,88}, //국어
				{34,99,45}, //수학
				{89,65,74} //영어
		};
		//국어합게: 평균: 00.0
		//수학: 
		//영어
		//전체
		String[] clsArr= {"국어","수학" ,"영어"};
		int[] sumArr=new int[clsArr.length];

		for(int i=0;i < arr.length;i++) {
			for(int z=0;z<arr[i].length;z++) {
				sumArr[i]+=arr[i][z];
			}
		}
		int sum=0;
		int div=0;
		for(int i=0;i<clsArr.length;i++) {
			float avg=sumArr[i]/(float)arr[i].length;
			System.out.printf("%s합계: %d, 평균 : %.1f\n",clsArr[i],sumArr[i],avg);
			sum+=sumArr[i];
			div+=arr[i].length;
		}
		System.out.printf("전체합계: %d, 전체평균 : %.1f\n",sum,(float)sum/div);
	}
}
