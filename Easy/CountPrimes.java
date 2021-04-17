import java.util.Arrays;

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.4.23*/
		/*Refer to https://www.youtube.com/watch?v=4kRJnWbt_CI&feature=youtu.be*/
		CountPrimes cp = new CountPrimes();
		System.out.println(cp.countPrimes(2));
	}
    public int countPrimes(int n) {
        	int count = 0;

	        boolean[] primes = new boolean[n+1];
	    	Arrays.fill(primes, true);
	    	
	    	for(int i=2 ; i*i <= n ; i++) {
	    		if(primes[i]) {
	    			for(int j=i*i ; j<=n ; j+=i)
	    				primes[j] = false;
	    		}
	    	}
	    	
    	for(int i=2 ; i<primes.length-1 ; i++) {
    		if(primes[i])
    			count++;
	    }
    	
    	return count;
    }
}
