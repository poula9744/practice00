package com.javaex.ex05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferBufferedFilterTest {

	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("C:\\javaStudy\\test.txt");
			BufferedInputStream bin = new BufferedInputStream(in); //기본스트림으로 필터스트림을 생성
			
			OutputStream out = new FileOutputStream("C:\\javaStudy\\test1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int byteData = 0;
			
			while(true) {
				byteData = bin.read();
				if(byteData == -1) {
					break;
				}
				bout.write(byteData);
			}
			
			in.close();
			out.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
