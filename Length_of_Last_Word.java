package AllCodes;

public class Length_of_Last_Word {

	public int lengthOfLastWord(String s) {
	       String temp[]=s.split(" ");
	       
	        String last=temp[temp.length-1];
	        
	        return last.length();
	    }
}
