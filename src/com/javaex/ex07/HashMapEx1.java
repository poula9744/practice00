package com.javaex.ex07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("castello", "1234");
		map.put("asdf", "1234");
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id: ");
			String id = sc.nextLine().trim();
			
			System.out.print("password: ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { //boolean containsKey(Object key): HashMap에 지정된 키가 포함되었는지 알려준다
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			} else {
				if(!map.get(id).equals(password)) { //Object get(Object key): 지정된 키의 값(객체)을 반환한다
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
				} else {
					System.out.println("id와 비밀번호가 일치합니다");
					break;
				}
			}
			
		}
		sc.close();
	}

}
