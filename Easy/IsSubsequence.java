public class IsSubsequence {
    public static void main(String[] args) {
        IsSubsequence is = new IsSubsequence();
        System.out.println(is.isSubsequence("acb","axbgdc"));
    }
    public boolean isSubsequence(String s, String t) {
        /*19.8.29 12:28
        * 將所有不存在於s中的t都刪掉，若存在則將索引儲存於陣列
        * */
        int temp = Integer.MIN_VALUE ,  count = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(t.contains(String.valueOf(s.charAt(i)))) {
                for (int j = 0; j < t.length(); j++) {
                    if (s.charAt(i) == t.charAt(j)) {
                        if(temp < j) {
                            temp = j;
                            count++;
                        } else
                            return false;
                    }
                }
            }
        }
        return count == s.length();
    }
}
