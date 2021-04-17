import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

	/*19.4.10*/
	private String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
			"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	private StringBuilder sb = new StringBuilder();
	private Set hashSet = new HashSet();
	
	public static void main(String[] args) {
		String[] q = {"gin", "zen", "gig", "msg"};
		UniqueMorseCodeWords umc = new UniqueMorseCodeWords();
		System.out.println(umc.uniqueMorseRepresentations(q));
	
	}
	
    public int uniqueMorseRepresentations(String[] words) {    
    	for(String word : words) {
    		char[] word_arr = word.toCharArray();
    		sb.delete(0, sb.length());
    		for(char c : word_arr) {
    			//System.out.println(c);
    			String getCharInMorseCode = morseCode[c - 'a'];
    			sb.append(getCharInMorseCode);
    		}
    		//System.out.println("----");
    		hashSet.add(sb.toString());
    	}
    	return hashSet.size();
    }
}