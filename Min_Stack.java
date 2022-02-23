package AllCodes;
import java.util.*;
public class Min_Stack {

	Stack<Integer> st;
    Stack<Integer> minSt;
    int minVal;
    public Min_Stack() {
        st= new Stack<>();
        minSt= new Stack<>();
        minVal=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        
        if(val<minVal){
            minVal=val;
        
        }
        minSt.push(minVal);
       st.push(val);
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
        if(minSt.size()!=0){
            minVal=minSt.peek();
        }else{
            minVal=Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
