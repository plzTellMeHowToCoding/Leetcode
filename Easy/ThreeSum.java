import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	private static int nums[] = {-1, 0, 1, 2, -1, -4};
	
	
	public static void main(String[] args) {
		threeSum(nums);
	}
	
	public static void threeSum(int[] nums){
		Arrays.sort(nums);
		for(int num : nums) 
			System.out.print(num+" ");
	}
}
