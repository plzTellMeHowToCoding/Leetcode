import java.util.ArrayList;
import java.util.List;

public class ShortestDistancetoaCharacter {
    public static void main(String[] args) {
        /*19.8.19*/
        ShortestDistancetoaCharacter obj = new ShortestDistancetoaCharacter();
        for(int n : obj.shortestToChar("loveleetcode",'e'))
            System.out.print(n+" ");
    }
    public int[] shortestToChar(String S, char C) {
        //宣告陣列串列來儲存C在S中的索引值
        List<Integer> list = new ArrayList<>();
        //宣告回傳答案陣列
        int[] result = new int[S.length()];
        //宣告用來比較是否為最短距離的變數
        int shortest_len = Integer.MAX_VALUE;

        //將C在S中的索引值都加入陣列串中
        for(int i=0 ; i<S.length() ; i++){
            if(S.charAt(i) == C)
                list.add(i);
        }

        //開始走訪S
        for(int i=0 ; i<S.length() ; i++){
            //若走訪到的該字元等於C，則填0
            if(S.charAt(i) == C)
                result[i] = 0;
            //否則與list中所有紀錄的索引值相減，取最小值
            else{
                //走訪list中所有索引值
                for(int j=0 ; j<list.size() ; j++){
                    //由於i可能比j小，得出來的答案會負值，故相減完後開絕對值
                    //判斷當前字元索引值-串列中的索引值是否有小於最短值，若有則取代最短值
                    if(Math.abs(i - list.get(j)) < shortest_len)
                        shortest_len = Math.abs(i - list.get(j));
                    //將最短值填入回傳陣列中
                    result[i] = shortest_len;
                }
                //將最短值重設
                shortest_len = Integer.MAX_VALUE;
            }
        }
        return result;
    }
}