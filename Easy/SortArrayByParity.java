import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		SortArrayByParity sab = new SortArrayByParity();
		int[] result = sab.sortArrayByParity(new int[] {3,2,1,4,3,2,1,4,3,2,1,4,3,2,1,4,3,2,1,4});
		for(int k : result)
			System.out.println(k);
		
	}
    public int[] sortArrayByParity(int[] A) {
        Arrays.sort(A);
        int[] B = new int[A.length];
        int t = 0;
        
        for(int i=0 ; i<A.length ; i++) {
        	if(A[i] % 2 == 0)
        		B[t++] = A[i];
        }
        for(int i=0 ; i<A.length ; i++) {
        	if(A[i] % 2 != 0)
        		B[t++] = A[i];
        }
        
        
        return B;
    }
}