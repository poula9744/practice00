package com.javaex.ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Person person = new Person("King", 10);
		String msg = "안녕하세요!!";
		
		try { //ObjectInputStream은 ObjectOutputStream을 사용하여 작성된 객체 및 기본데이터를 역 직렬화합니다
			ObjectOutputStream outputStream = null;
			FileOutputStream fos = new FileOutputStream("instanceData.ser");
			outputStream = new ObjectOutputStream(fos);
			outputStream.writeObject(person); //Person 인스턴스의 저장 
			outputStream.writeObject(msg); //String 인스턴스의 저장 
			
			ObjectInputStream inputStream = null;
			FileInputStream fis = new FileInputStream("instanceData.ser");
			inputStream = new ObjectInputStream(fis);
			Person newPerson = (Person) inputStream.readObject(); //저장 데이터 복원 
			String newStr = (String) inputStream.readObject(); //저장 데이터 복원
			
			newPerson.tell(); //정상적으로 복원 되어 메소드 실행 
			System.out.println(newStr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
	}

}

//직렬화: 객체상태 --> 바이트 스트림 --> 객체의 복사본 
//역직렬화: 직렬화된 객체 형식 --> 객체의 사본
