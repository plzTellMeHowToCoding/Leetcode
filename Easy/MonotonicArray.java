public class MonotonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.4.30*/
		
	}
    private boolean isInc(int[] A){
        for(int i=0 ; i<A.length-1 ; i++)
            if(A[i] < A[i+1])
                return false;
        
        return true;
    }
    
    private boolean isDec(int[] A){
        for(int i=0 ; i<A.length-1 ; i++)
            if(A[i] > A[i+1])
                return false;
        return true;
    }  
}
