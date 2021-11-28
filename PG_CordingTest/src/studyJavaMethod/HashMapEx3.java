package studyJavaMethod;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 참가자 명단, 참가자 총점, 평균, 최고점수, 최저점수 구하기
public class HashMapEx3 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>() {{
			put("김자바", 90);
			put("김자바", 100);
			put("이자바", 100);
			put("강자바", 80);
			put("안자바", 90);
			
		}};
		Set set = map.entrySet();  // key와 value 둘다 set에 포함
		Iterator it = set.iterator();  // iterator 반복자 클래스, 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조
		
		while(it.hasNext()) {  // 이후에 요소가 더 있는지 체크하는 메소드 boolean으로 return
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("이름: " + e.getKey()+ ", 점수" + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단: " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (int) it.next();
			total += i;
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + total/set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최고점수: " + Collections.min(values));
		
		

	}

}
