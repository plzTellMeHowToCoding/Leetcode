public class DIStringMatch {

	public static void main(String[] args) {
		String example = "IDID";
		DIStringMatch dism = new DIStringMatch();
		int[] getR = dism.diStringMatch(example);
		
		for(int i=0 ; i<getR.length ; i++)
			System.out.println(getR[i]);
	}

	public int[] diStringMatch(String S) {
        /*Ex.S = IDID , len = 4*/
		char[] char_s = S.toUpperCase().toCharArray();
		int[] result = new int[char_s.length+1];//result len = 5
        int countI = 0;
        int countD = char_s.length;
        for(int i=0 ; i<char_s.length ; i++) {
        	if(char_s[i] == 'I') {
        		result[i] = countI++;
        	}else if(char_s[i] == 'D') {
        		result[i] = countD--;
        	}
        }
        
        //Setting value to index 5
        switch(char_s[char_s.length-1]) {
        case 'I':
        	result[char_s.length] = countI++;
        	break;        	
        case 'D':
        	result[char_s.length] = countD--;
        	break;
        	
        default:
       		break;
        }       
        return result;
    }
}