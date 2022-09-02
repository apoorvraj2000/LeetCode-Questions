package AllCodes;

import java.util.*;

public class Average_Of_Levels_in_Binary_Tree {
	 public List<Double> averageOfLevels(TreeNode root) {
	        LinkedList<Double> ll = new LinkedList<>();
	        Queue<TreeNode> q = new LinkedList<>(); 

	        if (root == null) {
	            return ll;
	        }
	        q.add(root);
	        while (!q.isEmpty()) {
	            int n = q.size();  
	            double sum = 0.0;
	            for (int i = 0; i < n; i++) {
	                TreeNode node = q.poll(); 
	                sum += node.val;
	                if (node.left != null) { 
	                    q.offer(node.left);
	                }
	                if (node.right != null) {
	                    q.offer(node.right);
	                }
	            }
	            ll.add(sum / n); 
	        }
	        return ll;
	    }
}
