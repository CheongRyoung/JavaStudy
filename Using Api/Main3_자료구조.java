import java.util.*;

public class Main3_자료구조 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료구조 API
		// ArrayList = 순서가 있다. 반복문을 돌려야한다. => 상황에서 적절하게 사용
		// 학생이름(String)을 5개를 담을 공간을 생성해보자
		ArrayList<String> arr = new ArrayList<String>(); //내부 배열... 사실상 배열임, 장단점을 똑같이 가지고 있음
		arr.add("한조");
		arr.add("트레이서");
		arr.add("한조1");
		arr.add("한조2");
		arr.add("한조3");
		
		arr.add(2, "메르시"); // 중간에 넣는 기능을 제공하지만, 사용하지말자 오래걸림 오버헤드
		
		for(int i=0; i<arr.size(); i++) {
			String data = arr.get(i);
			System.out.println(data);
		}
		// 향상된 for문을 쓰는 이유는 간결한 것도 있지만, list의 클래스에 맞게 인서트 각각 작업을 수행하는게 추가 되어 있다.
		for(String data : arr) {
			System.out.println();
		}
		//Arraylist의 최악 method => arr.add(2, null) 중간 삽입, arr.remove(0); 중간 삭제  => 사용할거면 linked로 가야한다.
		//                         arr.contains("한조"); 존재확인 => 사용할거면 set으로 가자
		
		
	}
}
