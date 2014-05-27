package Testing;

public class BetterProgrammerTaskIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome(new String("av55va")));
		
	}
	
	 public static boolean isPalindrome(String s) {
	        /*
	          Definition: A palindrome is a string that reads the same forward and backward.
	          For example, "abcba" is a palindrome, "abab" is not.
	          Please implement this method to
	          return true if the parameter is a palindrome and false otherwise.
	         */
		    int countChars;
		 	
		 	if (s == null){
		 		return false;
		 	}
		 	
		 	int length = s.length();
		 	
		 	if (length == 0){
		 		return false;
		 	}
		 
//		 	if (length % 2 == 0){
		 		countChars = length / 2;
//		 	}else {
//		 		countChars = length / 2 + 1;
//		 	}
		 	
		 	int endPointer = length;
		 	
		 	for (int i = 0; i < countChars;i++){
		 	    
		 		endPointer = endPointer - i;
		 		
		 		if (s.charAt(i) != s.charAt(endPointer-1) ){
		 			return false;
		 		}
		 		
		 	}
		 	return true;
	    }

}
