import java.util.ArrayList;
import java.util.List;

public class NextGreaterElementI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.14*/
		NextGreaterElementI nge = new NextGreaterElementI();
		//new int[]{4,1,2}, new int[]{1,3,4,2} [-1,3,-1]
		//new int[]{2,4} , new int[]{1,2,3,4} [3,-1]
		//new int[]{1,3,5,2,4},new int[]{6,5,4,3,2,1,7} [7,7,7,7,7]
		//new int[]{1,3,5,2,4}, new int[]{5,4,3,2,1} [-1,-1,-1,-1,-1]
		//new int[]{4,1,2}, new int[]{1,2,3,4} [-1,2,3]
		int[] results = nge.nextGreaterElement(new int[]{1,3,5,2,4}, new int[]{5,4,3,2,1});
		for(int r : results)
			System.out.println(r);
	}
	
    List<Integer> list = new ArrayList<>();
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	//將nums2填入list中
    	fillList(nums2);
        int[] result = new int[nums1.length];
        int count = 0;
        
        //走訪nums1元素
        for(int num : nums1){
            //若在list中的num索引值 若不等於最後一個的話
        	if(list.indexOf(num) != list.size()-1){
        		result[count++] = getNextGreaterNum(num,list.indexOf(num),list);
        	//若是最後一個元素代表沒得比較，直接填入-1
            }else{
            	result[count++] = -1;
            }
        }
        return result;
    }
    
    //傳入欲比較的數字、索引、欲比較的串列，傳入大於的值 or -1
    private int getNextGreaterNum(int target , int index , List<Integer> list){
    	//從傳入的索引值開始走訪list
    	for(int i=index ; i<list.size() ; i++){
    		//若list得到的值 > 比較的數字， 回傳該值
    		if(list.get(i) > target){
    			return list.get(i);
    		}
    	}
    	//否則回傳-1
    	return -1;
    }
    
    private void fillList(int[] nums){
        for(int num : nums)
            list.add(num);
    }
}
