package q02.personSubClassCreate;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person("홍길동", "강남구", "01012345678", "hong@kr");
		System.out.println(p.toString());
		
		Student s = new Student("홍길동", "강남구", "01012345678", "hong@kr", 1);
		System.out.println(s.toString());
		
		Employee e = new Employee("홍길동", "강남구", "01012345678", "hong@kr", 101, 1000000);
		System.out.println(e.toString());
		
		Staff staff = new Staff("홍길동", "강남구", "01012345678", "hong@kr", 101, 1000000, "감독");
		System.out.println(staff.toString());
		
		Faculty f = new Faculty("홍길동", "강남구", "01012345678", "hong@kr", 101, 1000000, "9시", "A");
		System.out.println(f.toString());

	}

}
