import java.util.Arrays;
public class IntersectionofTwoArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.30*/
		IntersectionofTwoArrayII it = new IntersectionofTwoArrayII();
		//new int[]{1,2,2,1}, new int[]{2,2}
		//new int[]{4,9,5}, new int[]{9,4,9,8,4}
		int[] result = it.intersect(new int[]{2,2}, new int[]{1,2,2,1});
		for(int num : result)
			System.out.println(num);
	}
	//leetcode discuss看到的解法
	public int[] intersect(int[] nums1, int[] nums2) {	
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int index = 0 , i = 0 , j = 0 ;
		int[] result = new int[Math.min(nums1.length, nums2.length)];
		
		/*走訪nums1 & nums2內的元素*/
		while(i < nums1.length && j < nums2.length){
			/*若nums1[i] == nums2[j] 則將值填入result中
			 * 且將index(i , j)移動到下一個位置*/
			if(nums1[i] == nums2[j]){
				result[index++] = nums1[i];
				i++;
				j++;
			/*若nums1[i] < nums2[j]，代表元素不相同，只移動nums1至下一個位置*/
			}else if(nums1[i] < nums2[j]){
				i++;
			/*若nums1[i] > nums2[j]，代表元素不相同，只移動nums2至下一個位置*/
			}else if(nums1[i] > nums2[j]){
				j++;
			}
		}
		/*由於一開始宣告的陣列長度可能較實際陣列儲存的元素多，因此使用Arrays.copyOf(原陣列，新的長度)來做回傳值*/
		return Arrays.copyOf(result, index);
	}
	
	/*
	Map<Integer , Integer> nums1_map = new LinkedHashMap<>();
	Map<Integer , Integer> nums2_map = new LinkedHashMap<>();
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
    	Arrays.sort(nums1);
        Arrays.sort(nums2);
        fillMap(nums1,nums2);
        
        //得到nums1_map的keySet，進行走訪
        for(Object num : nums1_map.keySet()){
        	//若nums2_map中含有nums1_map的key
        	if(nums2_map.containsKey(num)){
        		//由於每個值有可能重複出現，故取nums1_map & nums2_map 中 兩個key的value，取較小值作為添加次數
        		for(int i=0 ; i<Math.min(nums1_map.get(num), nums2_map.get(num)) ; i++)
        			list.add((int) num);
        	}
        }
        //將answer物件添加值且回傳
        int[] answer = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++){
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    //將num1 , num2的值、出現次數加入map中
    private void fillMap(int[] nums1 , int[] nums2){
    	for(int num : nums1){
    		nums1_map.put(num,nums1_map.getOrDefault(num, 0)+1);
    	}
    	for(int num : nums2){
    		nums2_map.put(num,nums2_map.getOrDefault(num, 0)+1);
    	}
    }*/
}
