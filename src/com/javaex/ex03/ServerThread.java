package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerThread extends Thread{

	private Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			System.out.println("클라이언트가 연결되었습니다");
			
			//메세지 받기용 스트림
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//메세지 보내기용 스트림 
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while(true) {
				String msg = br.readLine();
				if(msg==null) {
					break;
				}
				
				System.out.println("받은 메세지: " + msg);
				
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
