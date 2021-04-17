public class PowerofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.5*/
		PowerofThree pt = new PowerofThree();
		System.out.println(pt.isPowerOfThree(1));
	}
	
	public boolean isPowerOfThree(int n) {
		
		/*Judge n < 3 then n != 1 return false,Otherwise return true.*/
		if(n < 3)
			if(n == 1)
				return true;
			else
				return false;
		
		/*使用迴圈，每次將n/3 若>=1則代表可能還有3的次方數或倍數，並且判斷n取3的餘數是否為0，若是的話則代表n有可能為3的倍數或3的次方數*/
		while((n/3) >= 1 && (n % 3) == 0){
			//判斷除以3之後是否為1，若等於一則代表此數是三的次方數，就回傳
			if(n /3 == 1)
				return true;
			//否則n除3
			else
				n/=3 ;
		}
		
		return false;
	}
}
