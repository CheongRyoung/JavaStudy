package studyJavaMethod;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		String A = "23four5six7";

		HashMap<String, String> map = new HashMap<String, String>(){{
			put("zero", "0");
			put("one", "1");
			put("two", "2");
			put("three", "3");
			put("four", "4");
			put("five", "5");
			put("six", "6");
			put("seven", "7");
			put("eight", "8");
			put("nine", "9");
			
		}};
			for(String s : map.keySet()) {
				A = A.replaceAll(s, map.get(s));
				
			}
			System.out.println(A);
			int answer = 0;
			answer = Integer.parseInt(A);
			
		
	}
}
