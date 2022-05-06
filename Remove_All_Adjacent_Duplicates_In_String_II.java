package AllCodes;
import java.util.*;

//Create a Pair class which contain character and its count
class Pair{
      char ch;
      int count;
      public Pair(char ch, int count){
          this.ch=ch;
          this.count=count;
      }
}
public class Remove_All_Adjacent_Duplicates_In_String_II {

	 public String removeDuplicates(String s, int k) {
	        //create a stack to Pair
	        Stack<Pair>st=new Stack<>();
	        for(int i=0;i<s.length();i++){
	            //get the current char
	            char ch=s.charAt(i);
	            //check is stack is empty or not
	            if(!st.isEmpty()){
	                //compare the current char with top of stack char
	                if(ch==st.peek().ch){
	                    //if both are same increment its count
	                    st.peek().count++;
	                }else{
	                    //else create a new pair and add this into stack
	                     Pair p=new Pair(ch,1);
	                     st.push(p);
	                }
	                //if top of stack char count is == k remove that char
	                if(st.peek().count==k)
	                    st.pop();
	                    
	            }else{
	                 //else create a new pair and add this into stack
	                Pair p=new Pair(ch,1);
	                st.push(p);
	            }
	        }
	        String ans="";
	        //add the char in ans string
	        while(!st.isEmpty()){
	            Pair p=st.pop();
	             for(int i=0;i<p.count;i++)
	                 ans=p.ch+ans;
	        }
	        return ans;
	    }
}
