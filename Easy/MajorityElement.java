public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.27*/
		MajorityElement me = new MajorityElement();
		//new int[]{2,2,1,1,1,2,2}
		//new int[]{3,2,3}
		//new int[]{6,5,5}
		int result = me.majorityElement(new int[]{2,2,1,1,1,2,2});
		System.out.println(result);
	}
    public int majorityElement(int[] nums) {
        int major = 0;
        int count = 0;
        
        for(int num : nums)
        	System.out.print(num +" ");
        
        System.out.println("----");
        for (int i=0; i<nums.length; i++){
            if (count==0){
                major = nums[i];
                System.out.println("count ==0"+i);
            }
            if (major == nums[i]){
                count++;
                System.out.println("major == nums[i]"+i);
            }else{
                count--;
                System.out.println("else"+i);
            }
        }
        return major;
    }
}