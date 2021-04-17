import java.util.ArrayList;
import java.util.List;

public class ToeplitzMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.26*/
		ToeplitzMatrix tm = new ToeplitzMatrix();
		//new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}} true
		//new int[][]{{1,2},{2,2}} false
		//new int[][]{{22,33,98},{34,22,33}} true
		//new int[][]{{11,74,7,93},{40,64,97,56}} false
		System.out.println(tm.isToeplitzMatrix(new int[][]{{39,24}}));
	}
	/*
	matrix = [
	          [1,2,3,4],
	          [5,1,2,3],
	          [9,5,1,2]
	        ]*/
    public boolean isToeplitzMatrix(int[][] matrix) {
    	
    	//將i取出作為local variable，使能夠讀取當前行的下一行
    	//例如當前讀第0行，使得能夠先讀到第1行
    	int i=0;
    	List<Integer> list = new ArrayList<>();
    	
    	//若矩陣長度<=1 則回傳true
    	if(matrix.length <= 1)
    		return true;
    	/*以行為主走訪
    	 * 走訪第n與n+1行*/
    	
    	//因為要讓內層第二個迴圈走訪到最後一行，故最外層走訪0~(列數-1)行
    	for(i=0 ; i<matrix[0].length-1 ; i++){
    		//走訪每行的元素，並加到list中
    		for(int j=0 ; j<matrix.length ; j++){
    			list.add(matrix[j][i]);
    			//System.out.println(matrix[j][i]);
    		}
    		//走訪i+1行的元素，並加到list中
    		for(int k=0 ; k<matrix.length ; k++){
    			list.add(matrix[k][i+1]);
    			//System.out.println(matrix[k][i+1]);
    		}
    		
    		/*以[1,2,3,4],[5,1,2,3],[9,5,1,2]為例
    		 * 我們以行為主走訪，可得知每次只需要比較前兩筆資料是否與下一行的後兩筆資料相符，就可以判斷是否符合題目要求
    		 * 因此將list內元素拿出來做比較，經過上面兩個迴圈的走訪後，第一次list內會有1,5,9,2,1,5這些元素
    		 * 只需比較上述矩陣的前兩筆資料是否與後兩筆相同(h+matrix.length+1)就可確認是否符合題目要求
    		*/
    		for(int h=0 ; h<matrix.length-1 ;h++){
    			if(list.get(h) != list.get(h+matrix.length+1)){
    			//	System.out.println(list.get(h));
    			//  System.out.println(list.get(h+matrix.length+1));
    				return false;
    			}
    		}
    		list.clear();
    	}
    	return true;
    }
}
