public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Medium*/
		RotateImage ri = new RotateImage();
		ri.rotate(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
		String s = Integer.toBinaryString(-3);
		System.out.println(s);
	}
	/*Given input matrix = 
		[
		  [1,2,3],
		  [4,5,6],
		  [7,8,9]
		],
		
		rotate the input matrix in-place such that it becomes:
		[
		  [7,4,1],
		  [8,5,2],
		  [9,6,3]
		]
	*/
    public void rotate(int[][] matrix) {
    	int temp;
    	for(int i=0 ; i<matrix.length-1 ; i++) {
    		for(int j=0 ; j<matrix[i].length ; j++) {
    			temp = matrix[i][j];
    			matrix[i][j] = matrix[i+1][j];
    			matrix[i+1][j] = temp;
    		}
    	}
    }
}
