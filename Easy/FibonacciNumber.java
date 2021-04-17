import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

	public static void main(String[] args) {
		/*19.4.15*/
		FibonacciNumber fn = new FibonacciNumber();
		System.out.println(fn.fib(8));
	}
	
	private List<Integer> list = new ArrayList<>();
	
    public int fib(int N) {
    	/*Using following method Runtime faster than 100% and Memory Usage less than 100%*/
    	list.add(0);
        list.add(1);
        list.add(1);
    	    	
    	int total = 0;
    	
    	if(N == 0)
    		return 0;
    	else if(N == 1 || N == 2)
    		return 1;
    	
    	for(int i=3 ; i<=N ; i++) {
    		list.add(list.get(i-1)+list.get(i-2));
    	}
    	
    	return list.get(list.size()-1);
    }
}
