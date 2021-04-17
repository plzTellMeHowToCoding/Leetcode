public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.4 faster than 100% , memory usage less than 100%*/
		DetectCapital dc = new DetectCapital();
		System.out.println(dc.detectCapitalUse("leetCode"));
	}
    public boolean detectCapitalUse(String word) {
        char[] char_arr = word.toCharArray();
        int charToInt = char_arr[0];
        boolean result;
        //Judge String word just has a character return true.
        if(word.length() == 1)
        	return true;
        //Judge the first character of word is A between Z
        else if(charToInt >= 65 && charToInt <=90) {
        	//Setting the second character of word is capital or not.
        	charToInt = char_arr[1];
        	//If the second character of word is capital means word is all capital string
        	if(charToInt >= 65 && charToInt <= 90) {
        		return Judge(char_arr,0);
        	//If the second character of word is not capital means word is first character capital,Others are non-capital
        	}else {
        		return Judge(char_arr,1);
        	}
        //Judge the first character of word is a between z , means all character of word is non-capital
        }else{
        	return Judge(char_arr,2);
        }
    }
    
    private boolean Judge(char[] char_arr , int type) {
    	//type0 = allCapital , type1 = first character capital , type2 = non-capital
    	int charToInt;
    	if(type == 0) {
    		for(int i=2 ; i<char_arr.length ; i++) {
    			charToInt = char_arr[i];
    			//If character is non-capital return false.
    			if(charToInt >= 97 && charToInt <= 122)
    				return false;
    		}
    	}else if(type == 1) {
    		for(int i=2 ; i<char_arr.length ; i++) {
    			charToInt = char_arr[i];
    			//If character is capital return false.
    			if(charToInt >=65 && charToInt <= 90)
    				return false;
    		}
    	}else {
        	for(int i=1 ; i<char_arr.length ; i++) {
        		charToInt = char_arr[i];
        		//If character is capital return false.
        		if(charToInt >= 65 && charToInt <= 90)
        			return false;
        	}
    	}
    	return true;
    }
}
