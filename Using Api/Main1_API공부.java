
public class Main1_API공부 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// API 공부하는 법?? : 필요한 것 검색해서 쓴다. (단, 문법이 정확할수록 제대로 쓸수 있다.)
		// 특정 몇몇  API는 적용하기 위해서 '이론'이 필요한 경우. (자료구조)
		// 특정 숫자의 절대값을 구하세요~!
		// APi 검색: java 절대값 api 등
		
		//중요한 API
		// 1. 자료구조(컬렉션 프레임 워크)
		// 2. 문자
		// 3. 숫자 - 날짜(문자-숫자-날짜 변환)
		
		String str = "안녕하세요.반갑습니다.잘부탁드립니다.";
		str.equals("ddd");
		str = str.concat("1111");  //리턴타입을 보면서 예측, void면 내부에서 바뀐다.
		System.out.println(str);
		str.indexOf('잘');
		str.indexOf("잘부");
		
		//문제: 아래와 같이 파일명이 존재 할때... 단, 우리는 알 수 없어...
		String fileName = "asdafwefndsiuofhwenfdjklsfijew.sdf.ds.fdsfs.d.jpg";
		String 확장자 = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(확장자);
		
		String str2 = "안녕하세요,반갑습니다,잘부탁드립니다";
		for (String s : str2.split(",")) {
			System.out.println(s);
		}
		
		String serchWord = " 트와이스가 부릅니다. 공백 제거 ";
		System.out.println(serchWord.trim());
		
		String serchWord2 = "tWice";
		String targetWord = "TWICE";
		if(serchWord2.toUpperCase().equals(targetWord.toUpperCase())) {
			System.out.println("same");
		} else {
			System.out.println("diffrent");
		}
	}

}
