package AllCodes;

public class Count_Of_Matches_In_Tournament {

	 public int numberOfMatches(int n) {
	        int matches=0;
	        while(n>1){
	            //is n is even
	            if(n%2==0){
	                matches+=n/2;
	                n=n/2;
	            }else{
	                //if n is odd
	                matches+=(n-1)/2;
	                n=((n-1)/2)+1;
	            }
	        }
	        return matches;
	    }
}
