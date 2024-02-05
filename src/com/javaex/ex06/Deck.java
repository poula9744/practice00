package com.javaex.ex06;

public class Deck {
	final int CARD_NUM = 52; //카드의 개수
	Card c[] = new Card[CARD_NUM];
	
	Deck() { //Deck의 카드를 초기화한다.
		int i = 0;
		
		for(int k=Card.KIND_MAX; k>0; k--) {
			for(int n=1; n< Card.NUM_MAX+1; n++) {
				c[i++] = new Card(k, n);
			}
		}
	}	
	
	Card pick(int index) { //지정된 위치(index)에 있는 카드 한 장을 선택
		if(0<=index&&index<CARD_NUM)
			return c[index];
		else
			return pick();
	}
		
	Card pick() { //Deck에서 하나의 카드를 선택
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
		
	void shuffle() { //카드 순서를 섞는다
		for(int n=0; n<1000; n++) {
			int i = (int)(Math.random()*CARD_NUM);
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
	}
}

