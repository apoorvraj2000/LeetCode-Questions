package AllCodes;

public class Reverse_Words_In_a_String_III {

	public String reverseWords(String s) {
        String store[]=s.split(" ");
        
        String ans="";
        
        for(String st: store){
            String curr=st;
            for(int i=curr.length()-1;i>=0;i--){
                ans+=curr.charAt(i);
            }
            ans+=" ";
        }
        return ans.trim();
    }
}
