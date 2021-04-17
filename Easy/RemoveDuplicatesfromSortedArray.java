public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 19.7.6
		RemoveDuplicatesfromSortedArray rdsa = new RemoveDuplicatesfromSortedArray();
		//new int[]{1,1,2}
		System.out.print(rdsa.removeDuplicates(new int[]{1,1,2}));
	}
	/*tips. 將不重複的數字往前塞*/
    public int removeDuplicates(int[] nums) {
    	int count = 0;
    	
    	//從0開始走訪陣列~陣列長度-1
    	for(int i=0 ; i<nums.length-1 ; i++){
    		//若陣列[count] != 陣列(下一個元素)，代表下一個元素跟當前元素不同
    		if(nums[count] != nums[i+1]){
    			//移動當前陣列的指標至下一個位置，並將下一個位置的值替代為不同的值
    			count++;
    			nums[count] = nums[i+1];
    		}
    	}
    	
    	return count+1;
    }
}
