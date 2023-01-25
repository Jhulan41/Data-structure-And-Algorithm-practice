
public class ValidPalindrome {
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				
				sb.append(Character.toLowerCase(c));
				
			}
			
		}
		if(sb.toString().equals(sb.reverse().toString()))
		
		return true;
		
		else
			
			return false;
	}
	
	
	

	public static void main(String[] args) {
		 
		
		String s1 = "A man, a plan, a canal: Panama";
		
		 if(isPalindrome(s1)) {
			 System.out.println("true");
		 }
		 else {
			 System.out.println("false");
		 }
		
		
		

	}

}
