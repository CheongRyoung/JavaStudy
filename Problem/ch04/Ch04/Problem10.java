package Ch04;

public class Problem10 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i<=100; i++ ) {
			if (i%3==0) {
				sum += i;
			}
		} System.out.println("총합은 : " + sum);

	}

}
