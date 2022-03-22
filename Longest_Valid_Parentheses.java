package AllCodes;

import java.util.*;
public class Longest_Valid_Parentheses {
    public static  int longestValidParentheses(String s) {
        int maxLength=0;
        Stack<Integer>st=new Stack<>();
        st.add(-1);
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='(') {
        			st.push(i);
        	}else {
        		st.pop();
        		if(!st.isEmpty()) {
        			int currMax=i-st.peek();
        			maxLength=Math.max(maxLength,currMax);
        		}else {
        			st.push(i);
        		}
        	}
        }
        return maxLength;
    }

}
