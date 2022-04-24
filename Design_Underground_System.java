package AllCodes;
import java.util.*;
class details{
       String sName;
       int time;
       public details(String sName,int time){
           this.sName=sName;
           this.time=time;
       }
   }
public class Design_Underground_System {


    Map<Integer,details>map;
    Map<String, int []>avg;
    public Design_Underground_System() {
          map=new HashMap<>();
          avg=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        details obj=new details(stationName,t);
        map.put(id,obj);
    }
    
    public void checkOut(int id, String stationName, int t) {
      details curr=map.get(id);
        //Source+Destination
        String SD=curr.sName+"|"+stationName;
        
        int time = t-curr.time;

        if(avg.containsKey(SD)){
            int count[]=avg.get(SD);
            count[0]+=time;
            count[1]++;
        }else{
            int count[]=new int[2];
            count[0]=time;
            count[1]=1;
            avg.put(SD,count);
        }
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        //Source+Destination
        String SD=startStation+"|"+endStation;
        
         int count[]=avg.get(SD);
        
        return (double)count[0]/(double)count[1];
        
    }
}
