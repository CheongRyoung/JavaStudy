
public class Main5_Thread {

	public static void main(String[] args) {
		//쓰레드 == 비동기...누가 먼저 실행될지 알수없다.,  동시에 실행시킬수 있다
		//프로그램 종료는 모든 쓰레드가 종료되어야 끝난다.
		
		System.out.println("실행되는 코드1...");
		System.out.println("실행되는 코드2...");
		
		SomeCalc sc = new SomeCalc();
		sc.start();
		
		System.out.println("실행되는 코드3...");
		System.out.println("실행되는 코드4...");
		
		Test1 t = new Test1();
		t.start();    //start()는 추가쓰레드로 실행시키는 것
//		t.run();      //run()은 단일쓰레드로 실행해나가는 것
		Test2 t2 = new Test2();
		t2.start();
		for(int i=0; i<300; i++) {
			System.out.println("메인쓰레드: " + i);
		}

	}
}

class SomeCalc extends Thread{
	
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
}

class Test1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("추가쓰레드: " + i);
		}
	}
}

class Test2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("추가2쓰레드: " + i);
		}
	}
}