package q02.TwoDimArray;

public class TwoDimArrayEx {

	public static void main(String[] args) {
		int[][] nums = {{1, 0, 0},
				{1, 1, 1},
				{1, 0, 1},
				{1, 0, 1}};
		// 출력
		for(int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.print("\n");
		}
		// 90
		for(int i=0; i<nums[0].length; i++) {
			for (int j=0; j<nums.length; j++) {
				System.out.print(nums[nums.length-1-j][i] + " ");
			}
			System.out.print("\n");
		}
		// 180
		for(int i=nums.length-1; i>=0; i--) {
			for (int j=nums[i].length-1; j>=0; j--) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		// 270
		for(int i=nums[0].length-1; i>=0; i--) {
			for (int j=0; j<nums.length; j++) {
				System.out.print(nums[j][i] + " ");
			}
			System.out.print("\n");
		}
	}

}
