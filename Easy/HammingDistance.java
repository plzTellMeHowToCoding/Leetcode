public class HammingDistance {

	public static void main(String[] args) {
		/*19.4.19*/
		HammingDistance hd = new HammingDistance();
		System.out.println("distance = "+hd.hammingDistance(7,5));
	}
    public int hammingDistance(int x, int y) { 	
    	if(x > y)
    		return getHammingDistance(x , y);
    	else
    		return getHammingDistance(y , x);    	
    }
    
    public int getHammingDistance(int x , int y) {
    	int distance = 0;
    	String binary_x = Integer.toBinaryString(x);
    	String binary_y = Integer.toBinaryString(y);
    	char[] c_x = binary_x.toCharArray();
    	char[] c_y = binary_y.toCharArray();
    	//128 = 10000000 len = 8 
    	//41 =    101001 len=6
    	for(int i=0 ; i<binary_y.length() ; i++) {
			//�q�}�C���ݩ��e�P�_�ܸ��u�}�C������
			if(c_x[c_x.length-i-1] != c_y[c_y.length-i-1]) {
				distance++;
				System.out.println("First loop = "+i);
			}
		}
		//�P�_���׸������}�C���P�_������
		for(int i=0 ; i<binary_x.length()-binary_y.length() ; i++) {
			System.out.println("In second loop");
			if(c_x[i] == '1') {
				distance++;
				System.out.println(distance);
			}
		}
		return distance;
    }
}
