package AllCodes;

public class Count_The_Number_Of_Consistent_Strings {

	 public int countConsistentStrings(String allowed, String[] words) {
	        int count=0;
	        for(int i=0;i<words.length;i++){
	            String s=words[i];
	            boolean flag =true;
	           for(int j=0;j<s.length();j++){
	                if(!allowed.contains(String.valueOf(s.charAt(j)))){
	                    flag=false;
	                    break;
	               }
	           }
	            if(flag)
	                count++;
	         } 
	          
	        return count;
	    }
}
