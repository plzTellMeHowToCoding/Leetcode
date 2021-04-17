import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.29*/
		MissingNumber mn = new MissingNumber();
		System.out.println(mn.missingNumber(new int[]{1,0}));
	}
	/*	Input: [9,6,4,2,3,5,7,0,1]
		Output: 8*/
    public int missingNumber(int[] nums) {
    	//先排序
    	Arrays.sort(nums);
    	//若長度為1且第一個索引為1 則傳0
    	if(nums[0] == 1 && nums.length==1)
    		return 0;
    	//若長度為1 且第一個元素為0 則傳2
    	else if(nums.length == 1 && nums[0] == 0)
    		return 1;
    	//若第一個元素為1，不計長度為多少 直接回傳0
    	else if(nums[0] == 1)
    		return 0;
    
    	//取得第一個索引元素
    	int temp = nums[0];
    	
    	//走訪陣列至nums.len-1
    	for(int i=0 ; i<nums.length-1 ; i++){	
    		//每次先取得下一個元素
    		temp = nums[i+1];
    		//比較當前元素與下一個相減是否為-1，因為排序過後有順序的元素每個元素間的差值應為-1，若不是則代表下一個元素有誤
    		if(nums[i] - temp != -1)
    			//回傳當前元素+1的值
    			return nums[i] + 1 ;
    	}
    	
    	//回傳最後一個元素的值+1
    	return nums[nums.length-1]+1;
    }
}
