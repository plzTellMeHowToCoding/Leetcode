public class DefanginganIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.9*/
		DefanginganIPAddress dia = new DefanginganIPAddress();
		System.out.println(dia.defangIPaddr("255.100.50.0"));
	}
	
	/*
	 * 	Example 1:

		Input: address = "1.1.1.1"
		Output: "1[.]1[.]1[.]1"
		Example 2:
		
		Input: address = "255.100.50.0"
		Output: "255[.]100[.]50[.]0"
	 * */
	
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        /*走訪字串，若有.，則附加"[.]"在字串中*/
        for(int i=0 ; i<address.length() ; i++){
        	if(address.charAt(i) == '.'){
        		sb.append("[.]");
        	}else{
        		sb.append(address.charAt(i));
        	}
        }
        
        return sb.toString();
    }
}
