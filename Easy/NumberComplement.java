public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.4.20*/
		NumberComplement nc = new NumberComplement();
		System.out.println(nc.findComplement(1));//101
	}
    public int findComplement(int num) {
        String binary_num = Integer.toBinaryString(num);
        char[] c_num = binary_num.toCharArray();
        
        for(int i=0 ; i<c_num.length ; i++) {
        	if(c_num[i] == '1')
        		c_num[i] = '0';
        	else
        		c_num[i] = '1';
        }
        System.out.println(String.valueOf(c_num));
        //Transform binary to decimal
        /*Integer.valueOf(Binary_String , 2);
         * Integer.valueOf(Octal_String , 8); Transform octal to decimal
         * */
        return Integer.valueOf(String.valueOf(c_num),2);
    }
}
