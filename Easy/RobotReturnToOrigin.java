public class RobotReturnToOrigin {

	public static void main(String[] args) {
		/*19.4.10*/
		String instruction = "LDRRLRUULR";
		RobotReturnToOrigin rrto = new RobotReturnToOrigin();
		System.out.println(rrto.judgeCircle(instruction));
		
	}
	/* R (right), L (left), U (up), and D (down)*/
    public boolean judgeCircle(String moves) {
    	int xPosition = 0 , yPosition = 0;
    	
    	for(int i=0 ; i<moves.length() ; i++) {
    		switch(moves.charAt(i)) {
    		case 'U':
    			yPosition++;
    			break;
    			
    		case 'D':
    			yPosition--;
    			break;
    			
    		case 'R':
    			xPosition++;
    			break;
    			
    		case 'L':
    			xPosition--;
    			break;
    			default:
    				break;
    		}
    	}
    	/*�ݯS�O�P�_x,y�O�_���b0�A�_�h�Y��LD���� x,y����-1���O���~����*/
    	return xPosition == 0 && yPosition == 0;
    }
}
