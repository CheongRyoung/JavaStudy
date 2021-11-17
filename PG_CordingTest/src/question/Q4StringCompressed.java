package question;

/* 다른 예로, "abcabcdede"와 같은 경우, 문자를 2개 단위로 잘라서 압축하면 "abcabc2de"가 되지만, 
 * 3개 단위로 자른다면 "2abcdede"가 되어 3개 단위가 가장 짧은 압축 방법이 됩니다. 
 * 이때 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여주면 됩니다.
압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로 문자열을 잘라 압축하여 
표현한 문자열 중 가장 짧은 것의 길이를 return 하도록 solution 함수를 완성 */

public class Q4StringCompressed {
	public int solution(String s) {
        int StringSlash = 1;
		String new_s = "";
        while (StringSlash <= s.length()/2) {
        	for (int i =0; i<s.length(); i++) {
        		if ( i + StringSlash*2 > s.length()-1) {
        			break;
        		}
        		String str = "";
        		if (s.substring(i, i + StringSlash).equals(s.substring(i + StringSlash, i + StringSlash*2))) {
        			str = Integer.toString(i+)
        			new_s = replaceFirst(s.substring(i, i + StringSlash), "");
        		}
        		
        	}
        	StringSlash++;
        }
		int answer = 0;
        return answer;
    }
}
