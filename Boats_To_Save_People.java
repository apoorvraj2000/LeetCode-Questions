package AllCodes;

import java.util.Arrays;

public class Boats_To_Save_People {

	 public int numRescueBoats(int[] people, int limit) {
	        Arrays.sort(people);
	        int count=0;
	        int si=0;
	        int ei=people.length-1;
	        while(si<=ei){
	            if(people[si]+people[ei]<=limit){
	                count++;
	                si++;
	                ei--;
	            }else{
	                count++;
	                ei--;
	            }
	        }
	        return count;
	    }
}
