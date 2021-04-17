import java.util.Arrays;

public class CompareStringsbyFrequencyoftheSmallestCharacter {
    public static void main(String[] args) {
        /*19.8.28 contest*/
        CompareStringsbyFrequencyoftheSmallestCharacter obj = new CompareStringsbyFrequencyoftheSmallestCharacter();
        int[] r = obj.numSmallerByFrequency(new String[]{"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"}
        ,new String[]{"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"});

        for(int n : r)
            System.out.println("**** "+n+" ****");
    }
    /**
     * queries = ["cbd"], words = ["zaaaz"]
     * queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
     */
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        //宣告兩個整數陣列，一個用於存放queries中最小字元出現次數；一個存放words中最小字元出現次數
        int[] minimum_queries = getMinimumCounts(queries);
        int[] minimum_word = getMinimumCounts(words);
        //宣告回傳陣列
        int[] result = new int[queries.length];
        //宣告計數器
        int count;
        //走訪queries陣列
        for(int i=0 ; i<minimum_queries.length ; i++){
            //將當前走訪到的索引內容取出(代表在queries[i]中最小字元出現次數)
            count = minimum_queries[i];
            //走訪words陣列
            for(int j=0 ; j<minimum_word.length ; j++){
                //只要words陣列中最小字元出現次數 > queries[i]中最小字元出現的次數 就將結果+1
                if(minimum_word[j] > count)
                    result[i]++;
            }
        }
        //回傳
        return result;
    }
    //回傳該字串陣列中，每個索引內最小的字元出現次數
    private int[] getMinimumCounts(String[] args){
        //宣告字元陣列存放每個字串陣列索引的內容
        char[] c_arr;
        //宣告回傳陣列，內包含每個字串陣列索引中最小字元出現次數
        int[] result = new int[args.length];
        //走訪字串陣列
        for(int j=0; j<args.length; j++){
            //將字串陣列中的字串轉換成字元陣列
            c_arr = args[j].toCharArray();
            //對字元陣列進行排序，字元的ASCII 小的會排前面
            Arrays.sort(c_arr);
            //走訪字元陣列
            for(int i=0 ; i<c_arr.length ; i++){
                //判斷若當前索引不等於最後一位的話就繼續走，並判斷下一個字元是否仍是同一個字元，若是的話就將總和+1
                if(i != c_arr.length-1 && c_arr[i] == c_arr[i+1])
                    result[j]++;
                else
                    break;
            }
            //若最小字元只出現過一次 或 最小字元位於最後一個索引 ， 則不會被上面判斷式判斷到，故最後要+1
            result[j]++;
        }
        return result;
    }
}
