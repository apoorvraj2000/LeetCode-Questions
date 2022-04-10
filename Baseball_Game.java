package AllCodes;

import java.util.Stack;

public class Baseball_Game {

	 public int calPoints(String[] ops) {
	        int ans=0;
	        Stack<Integer>st=new Stack<>();
	        for(String s:ops){
	            if(s.equals("+")){
	                int top=st.pop();
	                int newTop=top+st.peek();
	                st.push(top);
	                st.push(newTop);
	            }
	            else if(s.equals("D")){
	                int newTop=st.peek()*2;
	                st.push(newTop);
	            }
	            else if(s.equals("C")){
	                st.pop();
	            }
	            else{
	                int score=Integer.valueOf(s);
	                st.push(score);
	            }
	        }
	        while(!st.isEmpty()){
	            ans+=st.pop();
	        }
	        return ans;
	    }
}
