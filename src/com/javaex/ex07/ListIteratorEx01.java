package com.javaex.ex07;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//컬렉션의 요소에 접근할 때 Iterator는 단방향으로만 이동할 수 있는 데 반해 ListIterator는 양방향으로 이동이 가능 (단, List인터페이스를 구현한 컬렉션에서만 가능)
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) { //boolean hasNext(): 읽어올 다음 요소가 남아있는지 확인 - 있다 true / 없다 false
			System.out.print(it.next());
		}//순방향으로 진행하면서 읽어온다
		System.out.println();
		
		while(it.hasPrevious()) { //boolean hasPrevious(): 읽어올 이전 요소가 남아있는지 확인 - 있다 true / 없다 false
			System.out.print(it.previous());
		}//역방향으로 진행하면서 읽어온다

	}

}
