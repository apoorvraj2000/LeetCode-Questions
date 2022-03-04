package AllCodes;
import java.util.*;
public class Binary_Tree_Level_Order_Traversal {

	 public List<List<Integer>> levelOrder(TreeNode root) {
	        if(root==null)
	            return new LinkedList<>();
	        
	        //Final ans
	        List<List<Integer>>ans=new LinkedList<>();
	        //Queue for pendingNodes
	        Queue<TreeNode>pendingNodes=new LinkedList<>();
	        //Adding current root data into ans List
	        LinkedList<Integer> temp=new LinkedList<>();
	        temp.add(root.val);
	        ans.add(temp);
	        //Add current node in pendingNodes
	        pendingNodes.add(root);
	        //Add null in pendingNodes for separation of level
	        pendingNodes.add(null);
	        
	        LinkedList<Integer> smallAns=new LinkedList<>();
	        while(!pendingNodes.isEmpty()){
	            //Getting first pendingNode from queue
	            TreeNode front=pendingNodes.poll();
	            //Nothing left in queue to insert in smallAns
	            if(front==null){
	                break;
	            }
	            if(front.left!=null){
	                //adding current node left value in smallAns
	                smallAns.add(front.left.val);
	                //adding current node left in pendingNode queue
	                pendingNodes.add(front.left);
	            }
	            if(front.right!=null){
	                //adding current node right value in smallAns
	                smallAns.add(front.right.val);
	                //adding current node right in pendingNode queue
	                pendingNodes.add(front.right);
	            }
	            //Case for level separation
	            if(pendingNodes.peek()==null) {
	                //Add smallAns into main ans if smallAns is not empty
	                if(!smallAns.isEmpty())
	                   ans.add(smallAns);
	                
	                //reinitialize smallAns List
	                smallAns=new LinkedList<>();
	                //Remove first null from the queue
	            	pendingNodes.poll();
	                //add null in the last position of queue for level separation
	            	pendingNodes.add(null);
	            }
	        }
	        //return ans
	        return ans;
	    }
}
