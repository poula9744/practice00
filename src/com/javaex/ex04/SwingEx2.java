package com.javaex.ex04;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx2 extends JFrame {

	JFrame f;
	
	SwingEx2(){
		JFrame f = new JFrame();
		
		JButton b = new JButton("버튼");
		b.setBounds(50, 20, 100, 20);
		
		f.add(b);
		
		f.setSize(200, 100);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx2();
	}

}
