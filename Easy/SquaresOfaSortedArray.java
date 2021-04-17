import java.util.Arrays;

public class SquaresOfaSortedArray {
	public static void main(String[] args) {
		int[] a =  {-4,-1,0,3,10};
		SquaresOfaSortedArray sos = new SquaresOfaSortedArray();
		sos.sortedSquares(a);
		for(int k : a) {
			System.out.println(k);
		}
	}
	
    public int[] sortedSquares(int[] A) {
        for(int i=0 ; i<A.length ; i++) {
        	if(A[i] < 0)
        		A[i] *= -1;
       }
       Arrays.sort(A);
       
       for(int i=0 ; i<A.length ; i++) {
    	   A[i] *= A[i];
       }
       
       return A;
    }
}
