import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.3*/
		FindtheDuplicateNumber fdn = new FindtheDuplicateNumber();
		//new int[]{3,1,3,4,2}
		//new int[]{1,3,4,2,2}
		System.out.println(fdn.findDuplicate(new int[]{1,3,4,2,2}));
	}
    public int findDuplicate(int[] nums) {
    	
    	/*Sort array*/
    	Arrays.sort(nums);
    	/*Visit all elements in array*/
    	for(int i=0 ; i<nums.length-1 ; i++){
    		/*If number = next index number then return*/
    		if(nums[i] == nums[i+1])
    			return nums[i];
    	}
    	
    	/* Using Map to collect all elements in array
    	Map<Integer , Integer> map = new HashMap<>();
    	
    	for(int num : nums){
    		//put all elements to map
    		map.put(num, map.getOrDefault(num, 0)+1);
    	}
    	
    	//Visit all elements of map
    	for(Integer k : map.keySet()){
    		// If map.get(k) > 1 , then return.
    		if(map.get(k) > 1)
    			return k;
    	}
    	*/
    	return -1;
    }
}
