package q02.interfacepolymorphism;

public class InterfacePoly {

	public static void main(String[] args) {
		Lendable[] arr = {
				new SeperateVolume("가01", "진자", "푸코"),
				new SeperateVolume("가02", "서양", "미술사"),
				new AppCDInfo("가03", "Spring3.0")	
		};
		
		checkOutAll(arr, "김내리", "20140709");

	}

	private static void checkOutAll(Lendable[] arr, String string, String string2) {
		for (int i=0; i<arr.length; i++) {
			arr[i].checkOut(string, string2);
		}
		
	}

}
