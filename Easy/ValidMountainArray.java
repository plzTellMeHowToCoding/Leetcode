public class ValidMountainArray {

	public static void main(String[] args) {
		/*19.4.23*/
		ValidMountainArray vma = new ValidMountainArray();
		System.out.println(vma.validMountainArray(new int[] {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3}));
	}
    public boolean validMountainArray(int[] A) {
        boolean result = true;
        int MaxNumberIndex = getMaxNumberIndex(A);
    	
        if(A.length < 3)
        	result = false;
        //Peak can't be first or last index
    	else if(MaxNumberIndex == 0 || MaxNumberIndex == A.length-1)
    		result = false;
    	else {
    		for(int i=0 ; i<MaxNumberIndex ; i++) {
    			if(A[i] > A[MaxNumberIndex] || A[i] >= A[i+1]) 
    				result = false;
    		}
    		for(int i=A.length-1 ; i>MaxNumberIndex ; i--) {
    			//System.out.println(i);
    			if(A[i] >= A[i-1] || A[i] > A[MaxNumberIndex])
    				result = false;
    		}
    	}
    	return result;
    }
    
    public int getMaxNumberIndex(int[] A) {
    	/*Getting max number index from array A
    	 * �çP�_�O�_�����ƪ��̤j�Ȥ����A�Y���hindex = 0*/
    	int maxIndex = 0;
    	int temp = 0;
    	for(int i=0 ; i<A.length ; i++) {
    		if(A[i] > temp) {
    			temp = A[i];
	    		maxIndex = i;				
    		}else if(A[i] == temp)
    			maxIndex = 0;
    	}
    	System.out.println("Max Index = "+maxIndex);
    	return maxIndex;
    }
}
