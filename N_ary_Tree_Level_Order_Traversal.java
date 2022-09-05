package AllCodes;

import java.util.*;
class NODE {
    public int val;
    public List<NODE> childrens;

    public NODE() {}

    public NODE(int _val) {
        val = _val;
    }

    public NODE(int _val, List<NODE> _childrens) {
        val = _val;
        childrens = _childrens;
    }
}
public class N_ary_Tree_Level_Order_Traversal {
	 public List<List<Integer>> levelOrder(NODE root) {
	        Queue<NODE> q = new LinkedList<>(); 
	        List<List<Integer>> ll = new LinkedList<>();
	        if (root == null) {
	            return ll;
	        }
	        q.add(root);
	        while (!q.isEmpty()) {
	            int n = q.size(); 
	            List<Integer> current = new LinkedList<Integer>();
	            for (int i = 0; i < n; i++) {
	            	NODE node = q.poll();
	                current.add(node.val); 
	                q.addAll(node.childrens); 
	            }
	            ll.add(current); 
	        }
	        return ll;
	    }
}
