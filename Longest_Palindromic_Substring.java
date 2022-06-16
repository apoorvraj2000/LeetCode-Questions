package AllCodes;

public class Longest_Palindromic_Substring {
	public String longestPalindrome(String s) {
        if(s.length()<=1) return s;   
    
        int maxLength=1;
        int startingPoint=0;
       // using odd and even length method  
       for(int i=1;i<s.length();i++){
           //for even
           int left=i-1;
           int right=i;
           while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            if(maxLength<right-left+1){
            maxLength=right-left+1;
            startingPoint=left;
            }
            left--;
            right++;
           }
           //for odd
           left=i-1;
           right=i+1;
           while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            if(maxLength<right-left+1){
            maxLength=right-left+1;
            startingPoint=left;
            }
            left--;
            right++;
           }
           
       }
       
       return s.substring(startingPoint,maxLength+startingPoint);
    }
}
