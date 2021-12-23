import java.util.HashMap;

public class Main4_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap => 키와 값으로 저장, 반복용은 아님, 키로 값을 뽑아옴
		// Key는 항상 String타입이다...(라고 생각해도됨)
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // object면 모든 값을 받을 수 있다.
		
		map.put("aaa", 13); //핵심... aaa키로 값을 담는다.
		map.put("bbb", 27); //값을 넣는다.
		map.put("BBB", 16); //값이 수정된다. (같은 키로 값이 존재하면 덮어 씌운다.)
		map.put("CCC", 13); //값은 중복이 될수있다 키가 다르면
		
		int var = map.get("aaa");
		System.out.println(var);
		
		Integer var2 = map.get("asdawda");  //핵심... 키에 해당하는 값이 없으면... 정상적으로 null을 리턴한다. (exception아님)
		
	}

}
