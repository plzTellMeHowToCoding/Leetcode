import java.util.ArrayList;
import java.util.List;

public class LargestTriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.6.3 ������*/
		LargestTriangleArea lta = new LargestTriangleArea();
		System.out.println(lta.largestTriangleArea(new int[][] {{4,6},{6,5},{3,1}}));
	}
    public double largestTriangleArea(int[][] points) {
    	List<Integer> list = new ArrayList<>();
    	int bottom , height;
    	//�N�Ҧ�x�y�Эȶ�Jlist
    	list = fill_array(points,0);
    	bottom = getBottomOrHeight(list);
    	System.out.println("bottom = "+bottom);
    	list.clear();
    	list = fill_array(points,1);
    	height = getBottomOrHeight(list);
    	System.out.println("height = "+height);
    	return (bottom * height) /2.0 ;
    }
    
    public List<Integer> fill_array(int[][] points , int xOry){
    	List<Integer> result = new ArrayList<>();
    	for(int i=0; i<points.length ; i++) {
    		//System.out.println(points[i][xOry]);
    		result.add(points[i][xOry]);
    	}
    	return result;
    }
    
    //�qlist����X�̤j��
    public int getBottomOrHeight(List<Integer> list) {
    	int max = 0;
    	int min = Integer.MAX_VALUE;
    	for(int i=0 ; i<list.size() ; i++) {
    		if(list.get(i) > max)
    			max = list.get(i);
    		if(min > list.get(i))
    			min = list.get(i);
    	}
    	System.out.println(max);
    	System.out.println(min);
    	return max-min;	
    }
}
