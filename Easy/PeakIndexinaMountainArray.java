public class PeakIndexinaMountainArray {

	public static void main(String[] args) {
		/*19.4.14*/
		// TODO Auto-generated method stub
		int[] mountain = {1,2,3,4,5,6,7,8,9};
		PeakIndexinaMountainArray pima = new PeakIndexinaMountainArray();
		System.out.println(pima.peakIndexInMountainArray(mountain));
				
	}
    public int peakIndexInMountainArray(int[] A) {
        /*return peak index of array*/
    	int MaxIndex = getMaxNumberIndex(A);
    	
    	
    	for(int i=0 ; i<A.length ; i++) {
    		//�P�_�����ƭȬO�_�p��̤j��&&�k���ƭȬO�_�p��̤j��
    		if(!(A[i] < A[MaxIndex] && A[MaxIndex] > A[A.length-i-1])) {
    			MaxIndex = 0;
    			break;
    		}
    	}
    	return MaxIndex;
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
