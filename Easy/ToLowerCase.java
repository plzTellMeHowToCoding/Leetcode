public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToLowerCase t = new ToLowerCase();
		String s = t.toLowerCase("AbcCDdEefFgG");
		System.out.println(s);
	}
    public String toLowerCase(String str) {
        char[] c = str.toCharArray();
        for(int i=0 ; i<c.length ; i++) {
        	int charToInt = c[i];
        	//65 = A  90 = Z
        	if(charToInt >= 65 && charToInt <= 90) {
        	//if(charToInt < 97) {
        		c[i] = (char)(charToInt+32);
        	}else
    			c[i] = c[i];
        }
        //System.out.println((char)(b+32));
    	return String.valueOf(c);
    }
}
