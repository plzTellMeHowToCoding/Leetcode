import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.12*/
		AddtoArrayFormofInteger aafi = new AddtoArrayFormofInteger();
		List<Integer> list = aafi.addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9} , 10);
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
	/*Input: A = [1,2,0,0], K = 34
	Output: [1,2,3,4]
	Explanation: 1200 + 34 = 1234*/
	
    public List<Integer> addToArrayForm(int[] A, int K) {
    	// l = �}�CA������
    	int cur = K , l = A.length;
    	List<Integer> result = new ArrayList<>();

    	//�C���Nl����A�T�{�}�CA�O�_�٦���ƩνT�{cur�O�_>0
    	//�Ycur > 0�h�N��cur�٦����
    	while(--l >=0 || cur > 0) {
    		//�Yl(�}�CA���� >= 0)�A�N��}�CA�٦����
    		if(l >= 0)
    			//�Ncur�P�}�CA[l]����Ƭۥ[
    			cur += A[l];

    		//�Ncur % 10 (�o��̫�@�Ӧ줸�����) �[�Jresult
    		result.add(cur % 10);
    		//�Ncur / 10 �A�N��cur���U�@�Ӧ줸����
    		//Ex. cur = 910 , cur/=10 => 91
    		cur /= 10;
    	}
    	Collections.reverse(result);
    	return result;
    }
}
