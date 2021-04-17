import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.7*/
		TopKFrequentElements t = new TopKFrequentElements();
		//new int[]{1,1,1,2,2,3}, 2
		//new int[]{-1,-1},1
		List<Integer> list = t.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
		for(int k : list)
			System.out.println(k);
	}
	public List<Integer> topKFrequent(int[] nums, int k) {
    	int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        /*先將所有元素加入map中 => map(陣列內索引元素  , 出現次數) */    
        for(int i=0 ; i<nums.length ; i++){
        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1); 
        }
        
        //建立一個陣列，大小為map中的key數量
        int[] frequent = new int[map.keySet().size()];
        //走訪map中的所有key，並將每個key後面的value(出現次數)加入frequent中
        for(Integer key : map.keySet()){
        	frequent[count++] = map.get(key);
        }
        //將frequent從小排到大
        Arrays.sort(frequent);
        
        //走訪frequent陣列，由最大的開始，走訪到frequent.length-k-1(也就是k次)
        for(int i=frequent.length-1 ; i>frequent.length-k-1 ; i--){
        	//走訪map中的key
        	for(Integer key : map.keySet()){
        		//判斷map中的key獲取的value(出現次數)是否與frequent中相同，並判斷ans中沒有添加過此key，再進行添加
        		if(map.get(key) == frequent[i] && !ans.contains(key)){
        			ans.add(key);
        		}
        	}
        }
        return ans;
    }
}
