import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        /*19.9.11*/
        KeyboardRow kr = new KeyboardRow();
        for(String str : kr.findWords(new String[]{"asdllkjhgf", "ascfghjkl", "Dad", "Peace","a"}))
            System.out.println("***"+str+"***");
    }
    /*Declaration 3 rows chars*/
    String[] first_row = {"q","w","e","r","t","y","u","i","o","p"};
    String[] second_row = {"a","s","d","f","g","h","j","k","l"};
    String[] third_row = {"z","x","c","v","b","n","m"};

    public String[] findWords(String[] words) {
        //Declaration result
        List<String> result = new ArrayList<>();
        //Visiting words
        for(String word : words){
            //If just has one char, then add to result
            if(word.length() == 1)
                result.add(word);
            //Getting the first char in which row
            switch(charAtRows(word.charAt(0))){
                //in first row
                case 1:
                    //Visiting word[1] ~ word[len]
                    for(int i=1; i<word.length(); i++){
                        //if the current char not in the row , break
                        if(charAtRows(word.charAt(i)) != 1) {
                            break;
                            //if i = last , present all previous chars in same row, and add to the result.
                        }else if(i == word.length() -1) {
                            result.add(word);
                        }
                    }
                    break;
                case 2:
                    for(int i=1; i<word.length(); i++){
                        if(charAtRows(word.charAt(i)) != 2) {
                            break;
                        }else if(i == word.length() -1) {
                            result.add(word);
                        }
                    }
                    break;
                case 3:
                    for(int i=1; i<word.length(); i++) {
                        if (charAtRows(word.charAt(i)) != 3) {
                            break;
                        }else if(i == word.length() -1) {
                            result.add(word);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return result.toArray(new String[result.size()]);
    }
    //Getting the rows which contains char
    private int charAtRows(char c){
        //if the char in first_row, return 1
        for(int i=0 ; i<first_row.length; i++){
            if(String.valueOf(c).equalsIgnoreCase(first_row[i]))
                return 1;
        }
        //if the char in second_row, return 2
        for(int i=0 ; i<second_row.length; i++){
            if(String.valueOf(c).equalsIgnoreCase(second_row[i]))
                return 2;
        }
        //if the char in third_row, return 3
        for(int i=0 ; i<third_row.length; i++){
            if(String.valueOf(c).equalsIgnoreCase(third_row[i]))
                return 3;
        }
        return 0;
    }
}