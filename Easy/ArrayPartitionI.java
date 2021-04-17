import java.util.Arrays;

public class ArrayPartitionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.4.27*/
		ArrayPartitionI ap = new ArrayPartitionI();
		System.out.println(ap.arrayPairSum(new int[] {1,4,3,2}));
	}
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
    	int result = 0;
    	//�qarray���ݶ}�l�ǭǤ���A���p���ƪ����[��result
    	//i-=2�A��]�O�n����� 1��2�� 3��4��A�Y�ϥ�i--�A�|�ܦ� 1��2�� 2��3�� 3��4�� ����
    	for(int i=nums.length-1 ; i>0 ; i-=2) {
    		result += Integer.min(nums[i], nums[i-1]);
    	}    		
    	return result;
    }
}
