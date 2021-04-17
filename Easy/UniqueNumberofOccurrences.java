import java.util.*;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        /*19.10.14*/
        UniqueNumberofOccurrences obj = new UniqueNumberofOccurrences();
        //1,2,2,1,1,3
        //1,2
        //-3,0,1,-3,1,1,1,-3,10,0
        System.out.println(obj.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
    /*
    * Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
    * */
    public boolean uniqueOccurrences(int[] arr) {
        //Declaration Map to store number of arr
        Map<Integer,Integer> arr_map = new HashMap<>();
        //Storing occurrences time of each elements from arr
        List<Integer> list = new ArrayList<>();
        //Visit all elements of arr
        for(int i=0 ; i<arr.length ; i++){
            //Put occurrences of each elements from arr to map
            arr_map.put(arr[i],arr_map.getOrDefault(arr[i],0)+1);
        }
        //Storing map's value to list
        for(int value :arr_map.values()){
            list.add(value);
        }
        //Sorting list
        Collections.sort(list);
        //Visiting list，if current value equals to next then represent occurs duplicate value due to sorted already.
        for(int i=0 ; i<list.size()-1 ; i++){
            if(list.get(i) == list.get(i+1))
                return false;
        }
        return true;
    }
}
