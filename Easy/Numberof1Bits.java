public class Numberof1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.1*/
		Numberof1Bits nb = new Numberof1Bits();
	}
    public int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0 ; i<num.length() ; i++) {
        	if(num.charAt(i) == '1')
        		count++;
        }
        return count;
    }
}
