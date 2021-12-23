package network;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("서버 가동 시작....");
		
		ServerSocket ss = new ServerSocket(7777);
		
		Socket socket = ss.accept();
		
		System.out.println("누군가 접속했습니다.");
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String value = dis.readUTF();
		System.out.println("받은 값: " + value);
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("전송 할 값을 입력하세요");
		
		Scanner scn = new Scanner(System.in);
		String writeValue = scn.nextLine();
		
		dos.writeUTF(writeValue);
		
		socket.close();
	}

}
