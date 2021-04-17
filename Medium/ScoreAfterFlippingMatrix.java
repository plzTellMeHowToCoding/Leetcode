public class ScoreAfterFlippingMatrix {
    public static void main(String[] args) {
        /*19.8.15*/
        ScoreAfterFlippingMatrix safm = new ScoreAfterFlippingMatrix();
        System.out.println(safm.matrixScore(new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}}));
    }
    public int matrixScore(int[][] A) {
        /*先將各列最高位元都轉成1*/
        for(int i=0  ; i<A.length ; i++){
            if(A[i][0] == 0){
                for(int j=0 ; j<A[0].length ; j++){
                    if(A[i][j] == 0)
                        A[i][j] = 1;
                    else
                        A[i][j] = 0;
                }
            }
        }
        //宣告記錄每行1的個數 , 答案
        int c_one_count = 0  , result = 0;

        //將每行的1的個數累加
        for(int c=1 ; c<A[0].length ; c++){
            for(int r=0 ; r<A.length ; r++){
                if(A[r][c] == 1)
                    c_one_count++;
            }
            //若每行的1的個數 < 該行長度的一半，將該行的0,1互換
            if(!(c_one_count > A.length / 2)){
                //走訪每行
                for(int k = 0 ; k<A.length ; k++){
                    //將 0 換成 1  , 1 換成 0
                    if(A[k][c] == 1)
                        A[k][c] = 0;
                    else
                        A[k][c] = 1;
                }
            }
            //重置
            c_one_count = 0;
        }
        //宣告StringBuilder 用來將每列的值轉為字串
        StringBuilder sb = new StringBuilder();
        //走訪二維陣列
        for(int[] r : A) {
            for (int num : r) {
                sb.append(num);
            }
            //將每列的值從2進位轉成10進位後相加
            result += Integer.parseInt(sb.toString() , 2);
            //重置StringBuilder
            sb.delete(0,sb.length());
        }
        return result;
    }
}