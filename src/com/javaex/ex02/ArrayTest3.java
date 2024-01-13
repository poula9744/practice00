package com.javaex.ex02;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		/* for(자료형타입 변수이름 : 배열 또는 컬렉션의 원본) {
		 *    //배열이나 컬렉션 요소 개수만큼 순차적으로 실행합니다
		 *    	//각 요소 처리할 문장을 기술합니다
		 */

		int[] score = {100, 90, 70, 80, 65}; //배열 인스턴스 생성
		
		System.out.println("배열 score1 =====");
		for(int i : score) {
			System.out.println(i);
		} //변수 i에 배열의 각 요소 값이 저장되어 반복되어 출력
		
		
		int[][] scores = {
							{100, 90, 80},
							{98, 76, 90},
						};
		
		for(int[] is : scores) { //행의 반복
			for(int i : is) { //열의 반복
				System.out.print(i + ", \t");
			}
			System.out.println();
		}
	}

}
