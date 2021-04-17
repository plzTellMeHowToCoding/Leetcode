public class BuddyStrings {
    public static void main(String[] args) {
        BuddyStrings bs = new BuddyStrings();
        /*"aaaaaaabc","aaaaaaacb"*/
        /*"ab","ba"*/
        /*"ab","ca"*/
        /*"abab","abab"*/
        System.out.println('a'-'a');
        System.out.println(bs.buddyStrings("abab","abab"));
    }
    public boolean buddyStrings(String A, String B) {
        //宣告兩個變數存放兩個字串不同字源的索引值
        int diffA = -1 , diffB = -1;
        //若A 或 B 為空 或 A的長度不等於B 直接回傳false
        if(A.equals("") || B.equals("") || A.length() != B.length()){
            return false;
            //若A的字串與B一樣
        }else if(A.equals(B)) {
            //宣告長度為26的整數陣列
            int[] letters_count = new int[26];
            //走訪A字串，若有相同的字元出現則將該索引的位置++
            for(char c : A.toCharArray())
                /*ASCII a = 97*/
                letters_count[c - 'a']++;
                //走訪陣列，若有一個索引內的值>1，代表有兩個以上的相同字元可做替換
            for(int count : letters_count)
                if(count > 1)
                    return true;
            return false;
        }else{
            //走訪A字串
            for(int i=0 ; i<A.length() ; i++){
                //若第一次有不同的字元出現，使用diffA紀錄第一次不同的索引值
                if(diffA == -1 && A.charAt(i) != B.charAt(i)){
                    diffA = i;
                    //若第二次有不同的字元出現，使用diffB紀錄第二次不同的索引值
                }else if(diffA != -1 && A.charAt(i) != B.charAt(i)){
                    diffB = i;
                    //若diffA & diff B都不等於-1，又有不同的字元出現的話，則直接回傳false(因為題目描述只能交換一次)
                }else if((diffA != -1 && diffB != -1) && A.charAt(i) != B.charAt(i))
                    return false;
            }
        }
        //回傳 A字串在第一次出現不同的索引位置是否等於B在第二次出現不同索引的值 且 B在第一次出現不同的值是否等於A在第二次出現不同的值
        return A.charAt(diffA) == B.charAt(diffB) && B.charAt(diffA) == A.charAt(diffB);
    }
}