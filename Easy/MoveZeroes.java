import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.5.27*/
		MoveZeroes mz = new MoveZeroes();
		mz.moveZeroes(new int[] {0,0,1});
	}
	
	/*Input: [0,1,0,3,12] => Output: [1,3,12,0,0]*/
    public void moveZeroes(int[] nums) {	
    	List<Integer> list = new ArrayList<>();
    	for(int num : nums)
        	list.add(num);
        
        if(list.contains(0)){ 	
        	for(int i=0 ; i<list.size() ; i++) {
        		if(list.get(i) == 0) {
        			//�N0�K�[��list����
        			list.add(list.size(), 0);
        			//�N��e��m��0�R��
        			list.remove(list.get(i));
        		}
        	}
        }
        
        for(int i=0 ; i<list.size(); i++) {
        	nums[i] = list.get(i);
        	System.out.print(nums[i]);
        }
    }
}
