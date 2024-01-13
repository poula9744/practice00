package com.javaex.ex02;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[][] arr = new int[2][2];//2차원 배열 인스턴스생성
		
		//배열 요소 값 대입
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[1][0] = 21;
		arr[1][1] = 22;
		
		//배열 요소 출력
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		
		System.out.println("=====================");
		//배열 인스턴스 생성과 초기화
		int[][] score = {
							{100, 90, 80},
							{98, 76, 90},
							{85, 84, 77},
							{89, 100, 69}
						};
		
		//2차원 배열 요소 참조
		System.out.println("score[0][0]==> " + score[0][0]);
		System.out.println("score[1][1]==> " + score[1][1]);
		System.out.println("score[2][2]==> " + score[2][2]);
		System.out.println("score[3][2]==> " + score[3][2]);

	}

}
