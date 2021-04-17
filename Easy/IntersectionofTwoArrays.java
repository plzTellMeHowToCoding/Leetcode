import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.5.27*/
		IntersectionofTwoArrays ita = new IntersectionofTwoArrays();
		int[] results = ita.intersection(new int[] {1,2,2,1},new int[] {2,2});
		for(int result : results)
			System.out.println(result);
	}
	/*Input: nums1 = [1,2,2,1], nums2 = [2,2] => Output: [2]
		Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] => Output: [9,4]
	 */
    public int[] intersection(int[] nums1, int[] nums2) {      
    	List<Integer> list = new ArrayList<>();
    	//�ϥ�Set���󪺭�]�O����D�ئ����ƪ����޾ɭP�K�[���ƪ���
    	Set<Integer> result = new HashSet();
    	int count = 0;
    	
    	//�Nnums1���ȥ[�Jlist��
    	for(int num : nums1)
    		list.add(num);
    	//���Xnums2���Ҧ��ȡA�P�_list���O�_���]�tnums2����
    	//�Y���]�t�h�[�Jresult
    	for(int num : nums2) {
    		if(list.contains(num)) {
    			result.add(num);
    		}
    	}
    	//��l�Ƶ���
    	int[] intersection_array = new int[result.size()];
    	//�ϥ�Iterator���󨫳XSet���Ҧ���
    	Iterator iterator = result.iterator();
    	while(iterator.hasNext()) {
    		intersection_array[count] = (int) iterator.next();
    		count++;
    	}
    	return intersection_array;
    }
}
