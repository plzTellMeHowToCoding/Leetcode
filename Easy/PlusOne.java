import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//19.7.11
		PlusOne po = new PlusOne();
				
		int[] result = po.plusOne(new int[]{2,5,0,9});
		
		for(int num : result)
			System.out.print(num+" ");
			
	}
    public int[] plusOne(int[] digits) {
    	
    	//判斷最後一個數字+1是否要進位
    	if(digits[digits.length-1] + 1 == 10){
    		//count紀錄進位數
    		int count = 1;
    		int[] ans;
    		//使用list存放運算後的結果
    		List<Integer> list = new ArrayList<>();
    		//從最後一個數字開始往前算
    		for(int i=digits.length-1 ; i>=0 ; i--){
    			//若count != 0 ，代表有進位數要相加
    			if(count != 0){
    				//若當前數字+進位數 為10，則將當前位數設為0，並進位數 = 1
    				if(digits[i] + count == 10){
    					list.add(0);
    					count = 1;
    				}
    				//若當前數字+進位數不為10，則直接進行當前位數+1，且將進位數設為0
    				else{
    					list.add(digits[i]+count);
    					count = 0;
    				}
    			//若count == 0，代表沒有進位數要相加
    			}else
    				list.add(digits[i]);
        	}
    		//若走訪完整個陣列後進位數尚未處理，則將進位數放在list最後一個位置
    		if(count == 1)
    			list.add(1);
    		//初始化回傳陣列大小
    		ans = new int[list.size()];
    		//將list做反轉，因為在添加時list與陣列的順序相反
    		Collections.reverse(list);
    		//將ans陣列填值回傳
    		for(int i=0 ; i<list.size() ; i++)
    			ans[i] = list.get(i);
    		
    		return ans;
    		//否則直接將最後一個數字+1回傳
        }else{
        	digits[digits.length-1] += 1;
        	return digits;
        }
    }
}
