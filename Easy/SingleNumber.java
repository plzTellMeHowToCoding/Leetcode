import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.5.2*/
		SingleNumber sn = new SingleNumber();
		System.out.println(sn.singleNumber(new int[] {2,1,2,3,1}));
	}
	public int singleNumber(int[] nums) {
		int result = 0;
		//�إߤ@��hashmap
		Map<Integer,Integer> map = new HashMap<>();
		//�N�}�Cnums�����ȳ���Jmap��
		for(int num : nums) {
			//�Y�����ƪ�key�h���N�����key������value+1
			if(map.containsKey(num)) {
				map.replace(num, map.get(num), map.get(num)+1);
			}else {
				//�Y�L���ƪ�key�h�����Nnum�[�Jmap�ë��wvalue = 0 
				map.put(num, 0);
			}
		}
		//���ohashset�����Ҧ�key
		Set<Integer> key_set = map.keySet();
		//�ϥ�iterator���Xmap������
		Iterator i = key_set.iterator();
		while(i.hasNext()) {
			int value = (int) i.next();
			//�Ymap.get(key) == 0�A�N��map�����o��key�������ơA�ñN���Ȧ^��
			if(map.get(value)==0) {
				result = value;
				System.out.println(value);
			}
		}
		return result;
	}
}
