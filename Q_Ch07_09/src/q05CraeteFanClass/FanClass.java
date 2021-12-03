package q05CraeteFanClass;
//fields
//• constant(상수) : SLOW (1), MEDIUM (2), FAST (3)
//• speed (private int type, 초기값 SLOW)
//• on (private boolean type, 초기값 false)
//• radius (private double type, 초기값 5)
//• color (String type, 초기값 “blue”)
// constructor
//• default constructor 생성
// methods
//• Getter/setter 만들기 : 전체 fields 변수
//• public void printFanInformation() : on 이 true이면 speed, radius, color 출력하고,
//  on이 false이면 “선풍기가 꺼져 있습니다.”라는 내용 출력
public class FanClass {
	final int slow = 1;
	final int medium = 2;
	final int fast = 3;
	private int speed = slow;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	public FanClass() {
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void printFanInformation() {
//		on 이 true이면 speed, radius, color 출력하고,
//	    on이 false이면 “선풍기가 꺼져 있습니다.”라는 내용 출력
		if (on) {
			System.out.println("선풍기가 꺼져 있습니다.");
		} else {
			System.out.println("speed = " + this.speed + "radius = " + this.radius + "color = " + this.color);
		}
	}
		
}
