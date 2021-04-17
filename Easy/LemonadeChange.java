public class LemonadeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.4*/
		 LemonadeChange lc = new LemonadeChange();
		 System.out.println(lc.lemonadeChange(new int[] {5,5,10,10,20}));		
	}
    public boolean lemonadeChange(int[] bills) {
    	/*five_dollar_count = 5�����X��
    	 	ten_dollar_count = 10�����X��
    	 	give_back_money_count = �n��X��5��
    	 */
    	int five_dollar_count = 0 , ten_dollar_count = 0 ,give_back_money_count=0;
    	for(int bill : bills) {
    		switch(bill) {
    		//�Y���O�̥I�F5���A���Χ�� �B����5��++
    		case 5:
    			five_dollar_count++;
    			break;
    		//�Y���O�̥I�F10���A��@��5���A����10��++
    		case 10:
    			give_back_money_count = 1;
    			ten_dollar_count++;
    			//�P�_�n�䪺���O�_�h�������5��
    			if(give_back_money_count > five_dollar_count)
    				return false;
    			//�Y�S���h���W�������A�h������5��--
    			else
    				five_dollar_count -= give_back_money_count;
    			break;
    		//�Y���O�̥I�F20���A��@��10��+�@��5���A��3��5��
    		case 20:
    			//�P�_10����5�����ӼƬO�_���j��0�A�Y�O�h10����5�� --
    			if(ten_dollar_count > 0 && five_dollar_count >0) {
    				ten_dollar_count--;
    				five_dollar_count--;
    			//�_�h5���n��3��
    			}else {
	    			give_back_money_count = 3;
	    			//�P�_5���ӼƬO�_�h��3�ӡA�Y�O�h��false
	    			if(give_back_money_count > five_dollar_count)
	    				return false;
	    			//�N��W��5���Ӽ�-3
	    			else
	    				five_dollar_count -= give_back_money_count;
    			}
    			break;
    			default:
    				break;
    		}
    	}
    	return true;
    }
}
