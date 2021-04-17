import java.util.ArrayList;
import java.util.List;

public class SumofEvenNumbersAfterQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.2*/
		SumofEvenNumbersAfterQueries senaq = new SumofEvenNumbersAfterQueries();
		int result[] = senaq.sumEvenAfterQueries(new int[] {1,2,3,4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}});
		for(int num : result)
			System.out.println(num);
	}
	/*Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
		Output: [8,6,2,4]
		Explanation: 
		At the beginning, the array is [1,2,3,4].
		After adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
		After adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
		After adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
		After adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
	*/
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[A.length];
    	List<int[]> list = new ArrayList<>();
        
        for(int i=0 ; i<queries.length ; i++) {
        	list.add(queries[i]);
    	}
    	
    	for(int i=0 ; i<list.size() ; i++) {
    		int[] array_i = list.get(i);
    		A[array_i[1]] += array_i[0];
    		result[i] = sumOfEven(A);
    		//System.out.println(array_i[0]+","+array_i[1]);
    	}
    	return result;
    }
    
    public int sumOfEven(int[] array_i) {
    	int sum = 0;
    	for(int num : array_i) {
    		if(num % 2 == 0)
    			sum += num;
    	}
    	return sum;
    }
}
