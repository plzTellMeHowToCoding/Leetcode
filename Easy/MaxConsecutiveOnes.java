import java.util.*;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.4.29*/
		MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
		System.out.println(mco.findMaxConsecutiveOnes(new int[] {1}));
	}
    public int findMaxConsecutiveOnes(int[] nums) {
        /*Using set object to store consecutiveCount
         * cuz set will not store duplicate object*/
    	Set<Integer> result_list = new HashSet<>();
    	int consecutiveCount = 0;
        
        for(int num : nums) {
        	if(num == 1) {
        		consecutiveCount++;
        	}else {
        		result_list.add(consecutiveCount);
        		consecutiveCount = 0;
        	}
        }
        /*Using Iterator to visit all elements in set
         * and compare to consecutiveCount,if temp bigger than consecutiveCount
         * then consecutiveCount = temp*/
        Iterator i = result_list.iterator();
        while(i.hasNext()) {
        	int temp = (int)i.next();
        	if(temp > consecutiveCount)
        		consecutiveCount = temp;
        }
        
        return consecutiveCount;
    }
}
