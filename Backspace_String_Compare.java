package AllCodes;

import java.util.Stack;

public class Backspace_String_Compare {

	 public boolean backspaceCompare(String s, String t) {
	        Stack<Character>sTemp=new Stack<>();
	        Stack<Character>tTemp=new Stack<>();
	        fillStack(s,sTemp);
	        fillStack(t,tTemp);
	        
	        while(!sTemp.isEmpty() && !tTemp.isEmpty()){
	            if(sTemp.pop()!=tTemp.pop()){
	                 return false;
	            }    
	        }
	     
	        return sTemp.isEmpty() && tTemp.isEmpty();
	    }
	    public void fillStack(String s, Stack<Character>st){
	        for(int i=0;i<s.length();i++){
	            char c=s.charAt(i);
	            
	            if(c=='#'){
	                if(!st.isEmpty())
	                    st.pop();
	            }else{
	                st.push(c);
	            }
	        }
	    }
}
