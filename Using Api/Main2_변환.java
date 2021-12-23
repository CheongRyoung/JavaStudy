import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2_변환 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//숫자 - 문자 - 날짜의 변환
		int a = 10;      // 산술연산 가능
		String b = "20"; // 산술연산 불가능
		Date c= new Date();
		
		//1. 숫자를 문자로 바꾸는 법?
		int var1 = 20;
//		String var2 = var1 + "";
//		String var2 = String.valueOf(var1);
		
		//2. 문자를 숫자로 바꾸는 법?
		String var3 = "30";
		int var4 = Integer.parseInt(var3);  //숫자로 못바꿀 때는 exception 발생
		
		//3. 날짜를 숫자로 바꾸는 법?
		Date var5 = new Date(); //현재시간
		System.out.println(var5);
		long var6 = var5.getTime();
		System.out.println(var6);          // 1640225613475 밀리세컨드초, 1970년 0시 0분 이후부터 지난 초
		
		var6 = var6 - (1000*60*60*3); // 현재 시간으로 부터 3시간 이전의 숫자값을 만들자...
		
		// 4. 숫자를 날짜로 바꾸는 법?
		long var7 = 0;
		Date var8 = new Date(var6);
		System.out.println(var8);
		
		// 5. 날짜를 문자로 바꾸는 법?
		Date var9 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd"); //날짜를 문자로 바꾸는 변환기
		String var10 = sdf.format(var9);
		System.out.println(var10);
		
		//6. 문자를 날짜로 바꾸는 법
		String var11 = "2021-11-15";      
//		Date var12 = new Date(var11);  //   이 방법은 /구분자는 되는데 그 이외는 예외 발생
//		System.out.println(var12);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		Date var12 = sdf2.parse(var11);
		System.out.println(var12);
	}

}
