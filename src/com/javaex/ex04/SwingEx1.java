package com.javaex.ex04;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx1 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame(); //JFrame의 인스턴스 생성
		
		JButton b = new JButton("버튼");
		b.setBounds(50, 50, 100, 20); //만들어진 위도우 상에서 x축, y축, 너비, 높이
		
		f.add(b);
		f.setSize(200, 150); //윈도우의 사이즈: 폭 200과 높이 150
		f.setLayout(null); //레이아웃 관리자를 설정(사용)하지 않음 
		f.setVisible(true); //프레임을 화면에 표시
		

	}

}
