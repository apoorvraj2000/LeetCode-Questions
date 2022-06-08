package AllCodes;

public class Elimination_Game {
	
     public int lastRemaining(int n) {
        
        int head=1;
        int rem=n;
        int step=1;
        boolean left=true;
        //run the loop until remaining is > 1
        while(rem>1){
        	//if its left turn or number of remaining is odd
            if(left || rem%2==1){
                head=head+step;
            }
            //reduce remaining by half
            rem=rem/2;
            //double the step
            step=step*2;
            //change the turn
            left=!left;
        }
        return head;
    }
     
     //Memory Limit Exceeded error in this solution given below
     public int lastRemainingg(int n) {
         if(n==1)
            return 1;
        
        int []list=new int[n];
        
        for(int i=1;i<=n;i++){
            list[i-1]=i;
        }
        boolean front=true;
        while(n>1){
            if(front){
                for(int i=0;i<list.length;i+=2){
                    list[i]=-1;
                    n--;
                }
                list=getArray(list,n);
               
                front=false;
            }else{
                for(int i=list.length-1;i>=0;i-=2){
                    list[i]=-1;
                    n--;
                }
                list=getArray(list,n);
                
                front=true;
            }
        }
         return list[0];
    }
    
    public int[] getArray(int []arr,int n){
        int res[]=new int[n];
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                res[ind]=arr[i];
                ind++;
            }
        }
        return res;
        
    }
}
