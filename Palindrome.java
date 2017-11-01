import java.util.*;
public class Palindrome {

	private int solution = 0;
	private String s;
	static ArrayList<Integer> palindrome = new ArrayList<Integer>();
	private String reverse;
	
	public void multi () {
		for(int i = 0; i < 100; i++) {
			for(int j = 0; i < 100; j++) {
				solution = i * j;
				s = Integer.toString(solution);
				if(isaPalindrome(s)) {
					palindrome.add(solution);
					System.out.println(solution);
				}
			}
		}
		
	}
	public boolean isaPalindrome(String str) {
		int length = str.length();
		
		for ( int i = length - 1; i >= 0; i-- ) {
			reverse = reverse + str.charAt(i);
		}
		    
		if (str.equals(reverse)) {
		    return true;	  
		}
		else
			return false;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		p.multi();
		
	//	System.out.println(palindrome);
		
		
	}

}
