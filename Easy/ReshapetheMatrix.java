public class ReshapetheMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0/5);
	}
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        /*nums = [[1,2],[3,4]],r = 1, c = 4
		Output: [[1,2,3,4]]*/
    	//�P�_r*c �O�_�����x�}����*�e �A�Y������h�L�k�ഫ �^�ǭ�x�}
    	int[][] result = new int[r][c];
    	if(nums.length * nums[nums.length-1].length != r * c)
    		return nums;
    	else {
	        for(int i=0 ; i<nums.length ; i++) {
	        	if(nums[i].length < c)
	        		
	        	for(int j=0 ; j<nums[i].length ; j++) {
	        		
	        	}
	        }
    	}
        return result;
    }
}
