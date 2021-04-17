/**
 * 19.6.25
 * */
public class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        int right = 0, left = 0;
        if (S.length() == 0) {
            return 0;
        } else {
            for (int i = 0; i < S.length(); i++) {
                char b = S.charAt(i);
                if (b == '(')
                    left++;
                else if (b == ')' && left > 0)
                    left--;
                else if (b == ')')
                    right++;
            }
        }
        return right + left;
    }
}