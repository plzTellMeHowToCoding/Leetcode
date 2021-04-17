package lc.Leetcode;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.11*/
		FactorialTrailingZeroes ftz = new FactorialTrailingZeroes();
		System.out.println(ftz.trailingZeroes(1000));
	}
	/*每階乘後面的0為n除以5除到不能再除為止*/
	//1000 => 1000/5 = 200
	//200/5 = 40
	//40/5 = 8
	//8/5 = 1
	//1+8+40+200 = 249
    public int trailingZeroes(int n) {
    	int count = 0;
    	
    	while(n > 0){
    		n/=5;
    		count += n;
    	}
    	
    	return count;
    }
}
