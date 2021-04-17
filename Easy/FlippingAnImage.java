public class FlippingAnImage {

	public static void main(String[] args) {
		int[][] image = new int[][]{{1,1,0},{0,1,1},{1,1,1}};
		
		FlippingAnImage f = new FlippingAnImage();
		int[][] i2 = f.flipAndInvertImage(image);
		
		for(int i=0 ; i<i2.length ; i++) {
			for(int j=0 ; j<i2[i].length ; j++)
				System.out.print(i2[i][j]);
		
			System.out.println();
		}
	}
	
	public int[][] flipAndInvertImage(int[][] A) {
		//Step1 Horizontal flip image([1,0,0],[1,0,1] -> [1,0,1],[1,0,0])
		//Step2 Invert image (0 -> 1 or 1 -> 0)	
		int[][] C = new int[A.length][];
		int lastIndexOfA ;
		for(int i=0 ; i<A.length ; i++) {
			C[i] = new int[A[i].length]; 
			int k=0 ;
			for(int j=A[i].length-1 ; j>=0 ; j--) {
				lastIndexOfA = A[i].length-1;//2
				//C[i][j] = A[i][lastIndexOfA-j];//2-2
				C[i][k] = A[i][j];
				System.out.println(j);
				k++;
			}
		}		
		
		for(int i=0 ; i<C.length ; i++) {
			for(int j=0 ; j<C[i].length ; j++) {
				if(C[i][j] == 0)
					C[i][j] = 1;
				else
					C[i][j] = 0;
			}
		}
		return C;
	}
}