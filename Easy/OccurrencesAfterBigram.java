import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {
    public static void main(String[] args) {
        /*19.10.20*/
        OccurrencesAfterBigram oab = new OccurrencesAfterBigram();
        for(String str : oab.findOcurrences("we will we will rock you we will","we","will"))
            System.out.println(str);
    }
    /*
    * Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
        Output: ["girl","student"]
    *
    *
    * Input: text = "we will we will rock you", first = "we", second = "will"
        Output: ["we","rock"]
    * */
    public String[] findOcurrences(String text, String first, String second) {
        //Spilt text with space
        String[] text_spilt_with_space = text.split(" ");
        //Declaration a list store ans
        List<String> list = new ArrayList<>();

        //Visiting text with space to len-2, due to if go to last one will occur index out of bound.
        for(int i=0; i<text_spilt_with_space.length-2; i++){
            //If text match first and second, then put i+2 to list
            if(text_spilt_with_space[i].equals(first) && text_spilt_with_space[i+1].equals(second)) {
                list.add(text_spilt_with_space[i+2]);
                //Moving index to next 2.
                i++;
            }
        }
        return list.toArray(new String[]{});
    }
}
