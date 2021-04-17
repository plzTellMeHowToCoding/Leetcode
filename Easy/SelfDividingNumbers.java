import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		/*19.4.13*/
		SelfDividingNumbers sdn = new SelfDividingNumbers();
		List l = sdn.selfDividingNumbers(47, 85);
		for(int i=0 ; i<l.size() ; i++)
			System.out.println(l.get(i));
		
	}
	
    public List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> list = new ArrayList<>();
    	String intToString;
    	char[] intStringToCharArr;
    	for(int i=left ; i<=right ; i++) {
    		list.add(i);
    		intToString = String.valueOf(i);
    		intStringToCharArr = intToString.toCharArray();
    		
    		for(char c : intStringToCharArr) {
    			//cuz / zero will lead to arithmeticexception
    			if(c == '0' || i % Integer.parseInt(String.valueOf(c)) != 0) {
    				list.remove(list.indexOf(i));
    				break;
    			}
    		}
    	}
    	return list;
    }
}
