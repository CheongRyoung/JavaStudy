package q01.forEx;

public class ForEx3 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("    *    ");
		System.out.println(str);
		for (int i=0; i<4; i++) {
			str.replace(3-i, 4-i, "*");
			str.replace(5+i, 6+i, "*");
			System.out.println(str);
		}

		for (int i=0; i<4; i++) {
			str.replace(i, 1+i, " ");
			str.replace(8-i, 9-i, " ");
			System.out.println(str);
		}
		
	}

}
