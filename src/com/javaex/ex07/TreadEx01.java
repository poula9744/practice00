package com.javaex.ex07;

import javax.swing.JOptionPane;

public class TreadEx01 {

	public static void main(String[] args) throws InterruptedException {
		TreadEx01_1 th1 = new TreadEx01_1();
		th1.start();
		
		//showInputDialog: 사용자에게 직접 입력을 받아올 수 있고 형태는 두 가지
		//키보드 입력을 직접받는 형태: JOpitonPane.showInputDialog(parentComponent, message, title, messageType);
		//옵션을 정해 입력받는 형태: JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, value[], initialValue);
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");

	}

}

class TreadEx01_1 extends Thread{
	
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
