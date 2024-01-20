package com.javaex.ex04;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingCardLayout {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("CardLayout 예제");
		
		CardLayout card = new CardLayout(40,30);
		
		f.setLayout(card);
		
		JButton b1, b2, b3;
		b1 = new JButton("손흥민");
		b2 = new JButton("메시");
		b3 = new JButton("호날두");
		
		//익명클래스 형태로 이벤트 리스너 정의 
		//next(f.getContentPane()): 전달 받은 컨테이너의 다음 카드로 넘길 때 사용
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane()); //next() 메소드로 다음 컨테이너로 넘김
			}
		};
		
		
		b1.addActionListener(listener); //버튼에 이벤트 등록
		b2.addActionListener(listener); 
		b3.addActionListener(listener); 

		f.add("a", b1);
		f.add("b", b2);
		f.add("c", b3);
		
		f.setSize(200, 200);
		f.setVisible(true);
	}

}
