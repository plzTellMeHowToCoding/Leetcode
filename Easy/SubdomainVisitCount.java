import java.util.ArrayList;
import java.util.List;

public class SubdomainVisitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.4.25*/
		SubdomainVisitCount svc = new SubdomainVisitCount();
		
		System.out.println(svc.subdomainVisits(new String[] {"900 google.mail.com", 
				"50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
		
		/*String ex = "900 google.mail.com";
		String[] ex_a = ex.split("\\.");
		for(String s : ex_a)
			System.out.println(s);*/
	}
    public List<String> subdomainVisits(String[] cpdomains) {
    	List<String> list = new ArrayList<String>();
    	String[] cpdomains_split;   	
    	
    	for(int i=0 ; i<cpdomains.length ; i++) {
    		list.add(cpdomains[i]);    		 		
    	}
    	
    	for(int i=0 ; i<list.size() ; i++) {
    		String[] split_with_space = list.get(i).split(" "); 
    		
    	}
    	
    	
    	return list;
    }
}
