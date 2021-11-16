package studyJavaMethod;

public class DeleteStringEx {

	public static void main(String[] args) {
		// deleteCharAt은 StringBuilder class를 인스턴스 생성해야 사용가능!
		StringBuilder str = new StringBuilder("Hello Java");
		str.deleteCharAt(5);
		System.out.println(str);
		
		// replace를 활용한 문자열제거 및 치환
		String str1 = "hello Java";
		str1 = str1.replaceAll("[^A-Z]", "");
		System.out.println(str1);
		
		// substring(x, y)를 활용한 문자열 나누기 및 합치기
		String str2 = "Hello world";
		String str3 = str2.substring(0, 5);
		String str4 = str2.substring(6);
		str2 = str3 + str4;
		System.out.println(str2);
		
	}

}
