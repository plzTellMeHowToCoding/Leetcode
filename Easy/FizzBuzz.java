import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.4.23*/
		FizzBuzz fb = new FizzBuzz();
		List<String> answerL = fb.fizzBuzz(15);
		
		for(int i=0 ; i<answerL.size() ; i++)
			System.out.println(answerL.get(i));

	}
	
	public List<String> fizzBuzz(int n) {
		List<String> answer = new ArrayList<String>();
	    
    	for(int i=1 ; i<=n ; i++) {
    		if(i%3 == 0 && i%5 == 0)
    			answer.add("FizzBuzz");
    		else if(i%3 == 0)
    			answer.add("Fizz");
    		else if(i%5 == 0)
    			answer.add("Buzz");
    		else
    			answer.add(String.valueOf(i));
    	}
    	
    	return answer;
    }
}
