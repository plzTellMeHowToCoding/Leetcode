public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		ReverseWordsinaStringIII r = new ReverseWordsinaStringIII();
		String reverseString = r.reverseWords(s);
		System.out.println(reverseString);

	}
    public String reverseWords(String s) {
        String[] s_arr = s.split(" ");
    	StringBuilder sb = new StringBuilder();
        
        for(String s_ : s_arr) {
        	char[] c_array = s_.toCharArray();
            char[] reverse_array = new char[c_array.length];
            int k=0;    
            for(int i=c_array.length - 1; i>=0 ; i--) {
            	reverse_array[k] = c_array[i];
            	k++;
            }
            sb.append(reverse_array).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }
}