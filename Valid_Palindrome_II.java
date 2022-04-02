package AllCodes;

public class Valid_Palindrome_II {

	 public boolean validPalindrome(String s) {
	        int si=0;
	        int ei=s.length()-1;
	        
	        while(si<ei){
	            if(s.charAt(si)==s.charAt(ei)){
	                si++;
	                ei--;
	            }else{
	                return isPalindrome(s, si+1, ei) || isPalindrome(s, si, ei-1);
	            }
	        }
	        return true;
	    }
	     public boolean isPalindrome(String s, int si, int ei){
	         while(si<ei){
	            if(s.charAt(si)==s.charAt(ei)){
	                si++;
	                ei--;
	            }else{
	                return false;
	            }
	        }
	         return true;
	     }
}
