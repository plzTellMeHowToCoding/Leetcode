public class DailyTemperatures {
    public static void main(String[] args) {
        /*19.8.20*/
        DailyTemperatures dt = new DailyTemperatures();
        for(int n : dt.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}))
            System.out.print(n +" ");
    }
    public int[] dailyTemperatures(int[] T) {
        //宣告回傳陣列
        int[] result = new int[T.length];
        //走訪T
        for(int i=0 ; i<T.length ; i++){
            //若走訪到最後一個元素，直接填0
            if(i == T.length - 1)
                result[i] = 0;
            //從i的下一個索引開始走訪陣列
            for(int j=i+1 ; j<T.length ; j++){
                //若走訪到J發現值比I大，則計算兩個索引之間的差，並填入回傳陣列中
                if(T[i] < T[j]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}
