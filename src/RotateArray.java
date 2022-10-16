//Question 1 : Rotate Array

public class RotateArray {
	public void rotate(int[] nums, int k) {
		int k_final = k % nums.length;
		
		int[] result = new int[nums.length];
		
		for (int i = k_final; i < nums.length; i++) {
			result[i] = nums[i - k_final];
			
		}
		
		for (int i = 0; i < k_final; i++) {
			result[i] = nums[nums.length - k_final + i];
		}
		//result[0]= nums[nums.length-1];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = result[i];
		}
		
	}
}
