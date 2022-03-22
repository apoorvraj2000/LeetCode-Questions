package AllCodes;

public class String_To_Integer_atoi {

	public int myAtoi(String s) {
        s = s.trim();
       int ans=0;
       int sign=1;
       for(int i=0;i<s.length();i++){
           if(i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
               if(s.charAt(i)=='-')
                 sign=-1;
               
               continue;
           }
           
           if(s.charAt(i) < '0' || s.charAt(i) > '9') break;
           
          if(ans >= Integer.MAX_VALUE / 10 + 1) 
              return sign == 1 ? Integer.MAX_VALUE :Integer.MIN_VALUE;
           if(ans == Integer.MAX_VALUE / 10) {
               if(sign == 1 && Character.getNumericValue(s.charAt(i)) >= 8) {
                   return Integer.MAX_VALUE;
               } else if(sign == -1 && Character.getNumericValue(s.charAt(i)) > 8) {
                   return Integer.MIN_VALUE;
               }
           }
           ans = ans * 10 + Character.getNumericValue(s.charAt(i));
       }
       
      
       
       return ans*sign;
       
   }
}
