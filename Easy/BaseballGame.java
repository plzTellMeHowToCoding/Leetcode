import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
	
	private List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		/*19.4.13*/
		//String[] scores =  {"5","2","C","D","+"};
		//String[] scores =  {"5","-2","4","C","D","9","+","+"};
		String[] scores = {"-21","-66","39","+","+"};
		//String[] scores =  {"1","D","D","D"};
		BaseballGame bg = new BaseballGame();
		System.out.println("Total = "+bg.calPoints(scores));
		
	}
	//REGX:�P�_�}�Y�O�_��-���A?���X�{0����1���C�A�ӧP�_�Ʀr0-9�O�_���X�{�h��
	//�Y���h��ܬ��Ʀr�A�A�i��H�U�ާ@
	private String pattern = "^-?[0-9]*";

    public int calPoints(String[] ops) {
        int total = 0;
        for(int i=0 ; i<ops.length ; i++) {
        	/*�P�_�O�_���Ʀr�A�Y���Ʀr�h�[�`
        	 * D = Represents that the points you get in this round 
        	 	are the doubled data of the last valid round's points.
        	 * C = Represents the last valid round's points you get were invalid and should be removed.*/
        	if(ops[i].matches(pattern)) {
    			list.add(Integer.valueOf(ops[i]));
        	}
    		else if(ops[i].equals("C")) {
    			list.remove(list.size()-1);
    		}
    		else if(ops[i].equals("D")) {
    			//�o��list���̫�@�Ӥ��ƭȨ�*2�s�Jlist��
    			list.add(Integer.valueOf(list.get(list.size()-1)*2));
    		}
    		else if(ops[i].equals("+")){
    			list.add(list.get(list.size()-1)+list.get(list.size()-2));
    		}
    	}
        for(int i=0 ; i<list.size() ; i++) {
        	total += list.get(i);
        }
    	return total;
    }
}