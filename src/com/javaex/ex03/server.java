package com.javaex.ex03;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args)throws IOException {
		
		//서버소켓생성
		ServerSocket serverSocket = new ServerSocket();
		
		//바인딩 
		serverSocket.bind(new InetSocketAddress("255.255.255.0", 100));
		
		//서버시작 
		System.out.println("<서버시작>");
		System.out.println("===============");
		
		//반복
		while(true) {
			System.out.println("연결을 기다리고 있습니다");
			
			Socket socket = serverSocket.accept();
			
			Thread thread = new ServerThread(socket);
			thread.start();
		}
	}

}
