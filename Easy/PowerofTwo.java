public class PowerofTwo{
	public static void main(String[] args){}
	//19.7.8
	public boolean isPowerOfTwo(int n) {
        if(n == 1)
            return true;
        
		//使用迴圈，每次將n/2 若>=1則代表可能還有2的次方數或倍數，並且判斷n取2的餘數是否為0，若是的話則代表n有可能為2的倍數或2的次方數
        while((n/2) >=1 && (n%2) == 0){
            //判斷除以2之後是否為1，若等於一則代表此數是二的次方數，就回傳
			if((n / 2) == 1)
                return true;
            //否則n等於 n/2
			else
                n /= 2;
        }
        
        return false;
    }
}