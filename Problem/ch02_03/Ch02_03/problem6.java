package Ch02_03;

import java.util.Scanner;

/* 2개의 double 실수를 키보드로 부터 읽어, 2개의 실수값
모두 0과 1사이에 있는지 check하고 메시지를 출력하시오
 예 : 키보드 읽은 값 a, b
• 0<a<1, 0<b<1 check
• a, b 모두 0과 1사이에 있으면 “두 수 모두 0과 1사이에 있습니다” 출력
• a, b 모두 0과 1사이에 있지 않으면 “두 수 모두 0과 1사이에 있지 않습니다” 출력
*/
public class problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.println("2개의 실수를 입력하시오 ");
		
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        
        boolean bResult = (0<d1 && d1<1 && 0<d2 && d2<1);
        boolean bResult1 = ((0>d1 || d1>1) && (0>d2 || d2>1));
        boolean bResult2 = (0<d1 && d1<1);
        	System.out.println(bResult ? "두 수 모두 0과 1사이에 있습니다" : (bResult1 ? "두 수 모두 0과 1사이에 있지 않습니다" : (bResult2 ? "a만 0과 1 사이에 있습니다." : "b만 0과 1사이에 있습니다.")));
        }

	}


