package Ch04;

public class Problem9 {

	public static void main(String[] args) {
		//1)
		int num = 1;
		
		while (num <=6) {
			for(int j = 0; j<num; j++) {
				System.out.print("*");	
		} 
			System.out.println();
			num+=1;
		}

		//2)
		int i = 1;
		
		do {
			for (int j=6; j>=i; j--) {
				System.out.print("*");			
			} 
			System.out.println();
			i++;
			
		} while (i <= 6);
		
		//3)
		
		int z = 1;
		do {
			for (int j=5; j>=z; j--) {
				System.out.print(" ");			
			}
			for (int k=1; k<=z; k++) {
				System.out.print("*");
			}
			System.out.println();
			z++;
			
		} while (z <= 6);
			
		//4)
		
		for (int a = 1; a<=6; a++) {
			for (int b = 1; b<a; b++) {
				System.out.print(" ");
			}
			for (int c = 6; c>=a; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
