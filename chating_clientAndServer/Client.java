import java.util.*;
import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) throws Exception {   // throws를 exception으로 하면 비정상적인 종료는 파악못함
		Scanner scn = new Scanner(System.in);
				
		System.out.println("챗 클라이언트 실행한다.");
		System.out.println("사용하실 닉네임을 입력해주세요");
		String nickName = scn.nextLine();
		
		System.out.println("서버에 접속을 시도합니다....");
		Socket socket = new Socket("home.s001lec.com", 8977);   //접속... localhost=자신컴퓨터의 ip
		System.out.println("서버에 접속 했습니다...");
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); //출력관련 api..
		dos.writeInt(1); // 서버에게 닉네임 전달...   command(int) = 1.닉네임 전달(접속), 2. 메세지 전달, 3. 접속종료전달
		dos.writeUTF(nickName);
		
		RecvDataThread rdt = new RecvDataThread(socket);  //응답 쓰레드 생성 및 실행....
		rdt.start();
		
		
		while(true) {                                      //챗 입력...
			System.out.println("메세지 입력 (q=종료) > ");
			String message = scn.nextLine();
			
			if(message.equals("q")) {
				dos.writeInt(3);
				break;
			}
			dos.writeInt(2);
			dos.writeUTF(message);
		}
		
		socket.close();
		scn.close();
		System.out.println("챗 프로그램 종료. 이용해주셔서 감사합니다.");
	}

}

class RecvDataThread extends Thread{
	private Socket socket;
	
	public RecvDataThread(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while(true) {
				String message = dis.readUTF();
				System.out.println(message);
			}
		} catch (Exception e) {
			 System.out.println("리시브 쓰레드 익셉션 발생...");
		}
	}
}
