
public class ForStructure {

	public static void main(String[] args) {
		System.out.println(" 1번 “안녕하세요”를 5번 출력 하자");
		for (int i=0; i<5; i++) {
			System.out.println("안녕하세요");
		}
		System.out.println();
		
		System.out.println("for문을 이용해서 1부터 76까지의 합을 구하는 코드를 작성하자");
		int sum = 0;
		for(int i=1; i<=76; i++) {
			sum += i;
		}
		System.out.println("1부터 76까지의 합은 " + sum +"입니다.");
		System.out.println();
		
		System.out.println("구구단 7단을 출력해보자");
		int num = 7;
		for (int i=1; i<=9; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		System.out.println();
		
		System.out.println("구구단을 출력하되 7단과 6단을 제외하고 출력하자");
		for(int i=1; i<=9; i++) {
			if(i==6 || i==7) {
				continue;
			}
			System.out.println(i + "단");
			for (int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
				
			}
		}
		System.out.println();
		
		System.out.println("for문을 이용해서 1부터 1000까지의 합을 구하는 코드를 작성하되 3의 배수만 더하는 코드를 작성하자");
		int sum1 = 0;
		for(int i=1; i<=1000; i++) {
			if(i%3 != 0) {
				continue;
			}
			sum1 += i;
		}
		System.out.println("1부터 1000까지 숫자 중 3의 배수만 더한 합은 " + sum1 + "입니다.");
		System.out.println();
		
		System.out.println("자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. \r\n"
				+ "그 합이 언제(몇을 더했을 때) 1000을 넘어서는지 , \r\n"
				+ "그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해 보자.");
		int sum2 = 0;
		for(int i=1; i<=1000; i++) {
			if(i%3 == 0 || i%2 == 1) {
				sum2 += i;
			}
			if(sum2 >= 1000) {
				System.out.println(i + "넘었을 때,");
				System.out.println(sum2 + " 값이 됩니다.");
				break;
			}
			
		}
		System.out.println();
		
		System.out.println("1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, \r\n"
				+ "몇까지 더해야 총합이 100이상이 되는지 구하시오.");
		int sum3 = 0;
		for(int i=1; true; i++) {
			if (i%2==1) {
				sum3 +=i;
			} else if(i%2==0) {
				sum3 -= i;
			}
			if (sum3 >= 100) {
				System.out.println(i + "일 때 총합이 100이상이 됩니다.");
				System.out.println(sum3);
				break;
			}
		}
		System.out.println();
		
		System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.");
		int sum4 = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum4 += j;
			}
		}
		System.out.println("답은 " + sum4 + " 입니다.");
		System.out.println();
		
		System.out.println("863은 소수 인가?\r\n"
				+ "2~100사이의 소수를 구해보자");
		for(int i=2; i<=863; i++) {
			int cnt = 0;
			for(int j=2; j<i; j++) {
				if( i==2) {
					System.out.println(i + "소수입니다.");
					break;
				}
				if(i%j==0) {
					cnt++;
				}
			}
			if (cnt == 0) {
				System.out.println(i + "소수입니다.");
			}
		}
		System.out.println();
		
		System.out.println("파보나치 수열");
		int num1 = 0;
		int num2 = 1;
		for(int i=0; i<9; i++) {
			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			if (i==8) {
				System.out.println(temp);
			}
		}
		System.out.println();
		System.out.println("1~10000사이에 8이 몇번 나오는가?");
		int cnt = 0;
		for(int i=2; i<10000; i++) {
			if(i/1000==8) {
				cnt++;
			}
			if (i/100%10==8) {
				cnt++;
			}
			if (i/10%10==8) {
				cnt++;
			}
			if (i%10==8) {
				cnt++;
			}
		}
		System.out.println(cnt + "번");
		
		
	}

}
