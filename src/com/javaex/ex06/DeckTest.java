package com.javaex.ex06;

public class DeckTest {

	public static void main(String[] args) {
		
		Deck d = new Deck(); //카드 한 deck을 만든다
		Card c = d.pick(); //섞기 전 제일 윗장을 뽑는다
		System.out.println(c.toString());
		d.shuffle(); //카드를 섞는다
		c = d.pick(0); //섞은 후 제일 윗장을 뽑는다
		System.out.println(c.toString());

	}

}
