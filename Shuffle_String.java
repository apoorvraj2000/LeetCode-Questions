package AllCodes;

public class Shuffle_String {

	public String restoreStringA(String s, int[] indices) {
        char temp[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            temp[indices[i]]=s.charAt(i);
        }
        String ans="";
        for(char a:temp)
            ans+=a;
        
        return ans;
    }
	
	//Optimize Solution
	public String restoreStringB(String s, int[] indices) {
	       StringBuilder str = new StringBuilder(s);
	        
	        for(int i=0;i<indices.length;i++){
	            str.setCharAt(indices[i],s.charAt(i));
	        }
	        return str.toString();
	    }
}
