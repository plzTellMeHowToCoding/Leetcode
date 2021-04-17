import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JewelsAndStone {

	private static int count = 0;
	//�P�_�y�l���O�_�t��A�o�Ӧr���A+���A�ܤ֥X�{�@���Τ@���H�W�A.��ܥ��N�r��
	private static String pattern = ".*A+.*";
	//static Pattern pattern = Pattern.compile("A");
	//static Matcher matcher ;
	
	private static String jewels; 
	private static String stones;
	
	public static void main(String[] args) {
		//numJewelsInStones("aA","aAAbbbb");
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�_��(Jewels)�˦�");
		jewels = scn.nextLine();
		System.out.println("�п�J���Y(Stones)���X");
		stones = scn.nextLine();
		numJewelsInStones(jewels,stones);
		System.out.println(count);
	}

	public static int numJewelsInStones(String J , String S) {
		/*
		matcher = pattern.matcher(J);
		while(matcher.find())
			count++;
		matcher = pattern.matcher(S);
		while(matcher.find())
			count++;
		*/
		char[] jewels_array = J.toCharArray();
		char[] stones_array = S.toCharArray();
		
		for(char s : stones_array) {
			for(char j : jewels_array) {
				if(s == j)
					count++;
			}
		}
		
		return count;
	}
	
	
	public static int isJewelsInStones(String str) {
		if(str.matches(pattern)) {
			char[] answer = str.toCharArray();
			/*
			for(char c:answer)
				System.out.println(c);
			*/
			for(char c : answer) {
				if(c == 'A')
					count++;
			}
		}
		
		return count;
	}
	
}
