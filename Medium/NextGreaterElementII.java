public class NextGreaterElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterElementII nge = new NextGreaterElementII();
		//new int[]{1,2,1}
		//new int[]{5,4,3,2,1}
		//new int[]{1}
		//new int[]{-2,-3,-1}
		int[] result = nge.nextGreaterElements(new int[]{1,2,1});
		
		for(int n : result)
			System.out.println(n);
	}
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int greaterNumber = Integer.MIN_VALUE;
        if(nums.length == 1){
        	ans[0] = -1;
        	return ans;
        }
        for(int num : nums){
        	if(num > greaterNumber)
        		greaterNumber = num;
        }
        
        for(int i=0 ; i<nums.length ; i++){
        	if(nums[i] != greaterNumber){
        		ans[i] = greaterNumber;
        	}else{
        		ans[i] = -1;
        	}
        }
        
        /*
        for(int i=0 ; i<nums.length ; i++){
        	if(i == 0){
        		if(nums[i+1] > nums[i])
        			ans[i] = nums[i+1];
        		else if(nums[nums.length-1] > nums[i])
        			ans[i] = nums[nums.length-1];
        		else
        			ans[i] = -1;
        	}
        	else if(i == nums.length-1){
        		if(nums[i-1] > nums[i])
        			ans[i] = nums[i-1];
        		else if(nums[0] > nums[i])
        			ans[i] = nums[0];
        		else
        			ans[i] = -1;
        	}
        	else{
        		if(nums[i+1] > nums[i])
        			ans[i] = nums[i+1];
        		else if(nums[i] < nums[i-1])
        			ans[i] = nums[i-1];
        		else
        			ans[i] = -1;
        	}
        }
        */
        return ans;
    }
}
