import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RelativeRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelativeRanks rr = new RelativeRanks();
		//500,400,99,100,20
		//10,3,8,9,4
		for(String s : rr.findRelativeRanks(new int[]{500,400,99,100,20})){
			System.out.println(s);
		}
	}
	//10 , 3 , 8 , 9 , 4 nums
	// 3 , 4 , 8 , 9 , 10 list
	//"Gold Medal", "Silver Medal", "Bronze Medal"
    public String[] findRelativeRanks(int[] nums) {
    	List<Integer> list = new ArrayList<>();
        //list 存放尚已排序的值
        for(int num : nums)
        	list.add(num);
        //由小到大排序
        Collections.sort(list);
        String[] ans = new String[nums.length];
        //走訪nums(原陣列)
        for(int i=0 ; i<list.size() ; i++){
        	//判斷若nums[i]位於排序後的list倒數第三索引，代表為第三大
        	if(list.indexOf(nums[i]) == list.size()-3)
        		ans[i] = "Bronze Medal";
        	//判斷若nums[i]位於排序後的list倒數第二索引，代表為第二大
        	else if(list.indexOf(nums[i]) == list.size()-2)
        		ans[i] = "Silver Medal";
        	//判斷若nums[i]位於排序後的list倒數第三一引，代表為第一大
        	else if(list.indexOf(nums[i]) == list.size()-1)
        		ans[i] = "Gold Medal";
        	//其餘則填入list長度-nums[i]位於list的索引值(等於名次)
        	else
        		ans[i] = String.valueOf(list.size()-list.indexOf(nums[i]));
        }
        return ans;
    }
}
