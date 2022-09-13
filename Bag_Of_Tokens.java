package AllCodes;

import java.util.Arrays;

public class Bag_Of_Tokens {
	 public int bagOfTokensScore(int[] tokens, int power) {
	        Arrays.sort(tokens);
	        if (tokens.length == 0 || power < tokens[0]) 
	            return 0;
	        int n=tokens.length;
	        int score=0;
	        int ei=n-1;
	        int si=0;
	        while(si<=ei){
	            if(power>=tokens[si]){
	                score++;
	                power-=tokens[si];
	                si++;
	            }else{
	                if(ei-si>1){
	                    power+=tokens[ei];
	                    ei--;
	                    score--;
	                }else{
	                    break;
	                }
	            }
	        }
	        return score;
	    }
}
