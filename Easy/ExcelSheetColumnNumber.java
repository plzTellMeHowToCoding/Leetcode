public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.1*/
		ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
		System.out.println(escn.titleToNumber("ZY"));
	}
    public int titleToNumber(String s) {
    	int len = s.length();
    	int num = 0 , result = 0; 
    	//A = 65
    	//���X�r��
    	for(int i=0 ; i<len ; i++) {
    		//���o��e���X�쪺�r��
    		num = s.charAt(i);
    		//�N��e���X�쪺�r��-64(�]��A=65)�@���Y�ơA�M��A�N26(�]��A~Z�@��26��)��(len-��e���-1)����
    		result += (num-64) * Math.pow(26, len-i-1);
    	}
        return result;
    }
}
