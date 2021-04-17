import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FirstUniquCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.28*/
		FirstUniquCharacterinaString fucs = new FirstUniquCharacterinaString();
		System.out.println(fucs.firstUniqChar("loveleetcode"));
	}
	/*
	 * 	s = "leetcode"
		return 0.
		
		s = "loveleetcode",
		return 2.
	 * */
	
	public int firstUniqChar(String s) {
		
		Map<Character , Integer> map = new HashMap<>();
		if(s.length() == 0)
			return -1;
		
		for(int i=0 ; i<s.length() ; i++){
			/*if(!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), 0);
			else
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			*/
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(int i=0 ; i<s.length() ; i++){
			if(map.get(s.charAt(i)) == 1)
				return i;
		}
		
		/*
		//判斷若字串長度為0，回傳-1
		if(s.length() == 0)
			return -1;
		//使用LinkedHashMap key的順序為添加的順序
		Map<Character , Integer> map = new LinkedHashMap<>();
		//初始化char
		char target = ' ';
		
		//從0開始走訪字串，若map中已有char，則value++ , then value = 0
		for(int i=0 ; i<s.length() ; i++){
			if(!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), 0);
			else
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		
		//走訪map key ， 若map.get(key) == 0 , 回傳該key位於字串的索引直
		for(Object obj : map.keySet()){
			if(map.get(obj) == 0)
				return s.indexOf((char)obj);
		}
		
		//若沒有符合的答案回傳-1
		 * */
		return -1;
	}
}
