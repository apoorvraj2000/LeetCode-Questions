package AllCodes;

public class Check_If_the_Sentence_Is_Pangram {

	  public boolean checkIfPangram(String sentence) {
	        int []store =new int[26];
	        for(int i=0;i<sentence.length();i++){
	            char curr=sentence.charAt(i);
	            int index=curr-97;
	            store[index]=1;
	        }
	        for(int i:store){
	            if(i==0)
	                return false;
	        }
	        return true;
	    }
}
