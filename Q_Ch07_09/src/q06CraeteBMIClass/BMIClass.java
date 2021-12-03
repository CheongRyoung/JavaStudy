 package q06CraeteBMIClass;

//  fields
// • name (private String type), age (private int type)
// • weight, height (private double type, kgram, meter)
//  constructor
// • BMI (String name, double weight, double height) => age는 default 20
// • BMI (String name, int age, double weight, double height)
//  methods
// • public double getBMI() : BMI 계산 = 체중 / (키 * 키)
// 
// • getName(), getAge(), getWeight(), getHeight()
//  TestBMI class
// • 2개의 constructor에 대한 parameter설정하여 BMI 인스턴스 생성하여 getBMI(),
// getStatus()를 호출하여 비만도 결과 출력
public class BMIClass {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public BMIClass(String name, double weight, double height) {
		this(name, 20, weight, height);
		
	}
	
	public BMIClass(String name, int age, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.height = height;
	}
	public double getBMI() {
		return weight/(height*height);
	}
//	• public String getStatus() :
	//  - bmi < 18.5 인 경우 “저체중 입니다.”, 18.5 <= bmi < 25 인 경우 “정상 체중 입니다.”출력
	//  - 25 <= bmi < 30 인 경우 “과체중 입니다., - 30 <= bmi 인 경우 “비만 입니다.” 라는 내용 출력
	public void getStatus() {
		if ( getBMI() < 18.5 ) {
			System.out.println("저체중입니다.");
		} else if (getBMI() < 25){
			System.out.println("정상 체중 입니다.");
		} else if (getBMI() < 30){
			System.out.println("과체중 입니다.");
		} else {
			System.out.println("비만 입니다.");
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
	
}
