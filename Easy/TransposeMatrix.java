public class TransposeMatrix {

	public static void main(String[] args) {
		/*19.4.22*/
		TransposeMatrix tm = new TransposeMatrix();
		int[][] result = tm.transpose(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
		for(int[] rowOfResult : result) {
			for(int i=0 ; i<rowOfResult.length ; i++) {
				System.out.print(rowOfResult[i]+" ");
			}
			System.out.println();
		}
		
	}
    public int[][] transpose(int[][] A) {
        /*Input: [[1,2,3],[4,5,6],[7,8,9]]
         *Output: [[1,4,7],[2,5,8],[3,6,9]]
         *Input: [[1,2,3],[4,5,6]]
         *Output: [[1,4],[2,5],[3,6]]
         */
    	//Create matrix that row = �x�}A�C�������Ӽ� , columns = �x�}A�C������
    	int[][] result = new int[A[A.length-1].length][A.length];
    	
    	for(int j=0 ; j<A.length ; j++) {//Matrix A's row
    		for(int i=0 ; i<A[j].length ; i++) {//Matrix A's column
    			//��0�}�l �v�@��ȶi�C
    			result[i][j] = A[j][i];
    			
    		}
    	}
    	
    	return result;
    }
}
