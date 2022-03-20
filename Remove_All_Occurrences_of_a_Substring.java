package AllCodes;

public class Remove_All_Occurrences_of_a_Substring {
	public static String removeOccurrences(String s, String part) {
		//length of part
		int partlen=part.length();
        while(true){
        	//starting index of part in String s
        	int ind=s.indexOf(part);
        	//if part exist in String s
        	if(ind!=-1) {
        		s=s.substring(0,ind)+s.substring(ind+partlen);
        	}else {
        		//if part not exist in String s
        		break;
        	}
        }
        return s;
    }	
}
