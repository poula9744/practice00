package com.javaex.ex02;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[][] score = {
				{100, 90, 80},
				{98, 76, 90},
				{85, 84, 77},
				{89, 100, 69}
			};
		
		for(int i=0; i<score.length; i++) { //행의 반복: 변수 i는 행의 index
			for(int j=0; j<score[i].length; j++) { //열의 반복: 변수 j는 열의 index
				System.out.print("numbers["+i+"]["+j+"]=> " + score[i][j] + ", \t");
			}
			System.out.println();
		}

	}

}
