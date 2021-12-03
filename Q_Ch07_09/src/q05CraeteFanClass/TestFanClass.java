package q05CraeteFanClass;

//TestFan class
//• 첫번째 인스턴스 생성후에, speed(FAST), radius는 10, color는 “yellow”로 설정
//• 두번째 인스턴스 생성후에, speed(MEDIUM), radius는 5, color는 “blue”로 설정
//• 출력내용 : 2개의 인스턴스에 대하여 printFanInformation() 메소드 실행
public class TestFanClass {

	public static void main(String[] args) {
		FanClass user1 = new FanClass();
		user1.setSpeed(user1.fast);
		user1.setRadius(10);
		user1.setColor("yellow");
		
		FanClass user2 = new FanClass();
		user2.setSpeed(user2.medium);
		user2.setRadius(5);
		user2.setColor("blue");

		user1.printFanInformation();
		user2.printFanInformation();
	}

}
