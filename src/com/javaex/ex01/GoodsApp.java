package com.javaex.ex01;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 정보를 입력해주세요.");
		
		for(int i=0; i<goodsArray.length; i++) {
			
			System.out.print("상품 이름: ");
			String name = sc.nextLine();
			
			System.out.print("상품 가격: ");
			int price = sc.nextInt();
			
			sc.nextLine(); //String -> int -> (sc.nextLine??) -> String 
			
			goodsArray[i] = new Goods(name, price);
			System.out.println("-----------------------");
		}

		for(int i = 0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();
			//System.out.println(goodsArray[i].toString());
		}
		sc.close();
	}

}
